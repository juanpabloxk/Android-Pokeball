package com.juanp.apiconsumer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.juanp.apiconsumer.models.pokemon.Item;
import com.juanp.apiconsumer.pokeapi.PokeList;
import com.juanp.apiconsumer.pokeapi.PokeListObtainer;
import com.juanp.apiconsumer.ui.RVPokeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private List<String> objectList;
    private RecyclerView recyclerView;
    private RVPokeAdapter rvPokeAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private PokeListObtainer pokeObtainer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Drawable drawable = getDrawable(R.mipmap.ic_pokeball_foreground);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Drawable newIcon = new BitmapDrawable(getResources(),
                Bitmap.createScaledBitmap(bitmap, 80, 80, true));
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(newIcon);
        getSupportActionBar().setTitle("  Pokemons List");


        configureRecyclerView();
        pokeObtainer = new PokeListObtainer(getString(R.string.api_url));
        pokeObtainer.obtain(new PokeListObtainer.OnPokeListObtained()
            {
                @Override
                public void call(String statusMessage, PokeList pokeList)
                {
                    if(!statusMessage.equals(PokeListObtainer.SUCCESS))
                    {
                        Toast.makeText(MainActivity.this,
                                "Error getting pokemons: "+statusMessage,
                                Toast.LENGTH_LONG).show();

                        return;
                    }

                    Toast.makeText(MainActivity.this,
                            "Pokemons obtained: "+pokeList.getList().size(),
                            Toast.LENGTH_LONG).show();

                    rvPokeAdapter.setList(pokeList.getList());
                    rvPokeAdapter.notifyDataSetChanged();
                }
            }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.addItem:
            {
                this.addName();
                return true;
            }
            default:
            {
                return super.onOptionsItemSelected(item);
            }
        }
    }

    private void configureRecyclerView()
    {
        final String strNotLoaded = getString(R.string.pokemons_not_loaded);
        objectList = new ArrayList<String>(){{add(strNotLoaded);}};

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);

        rvPokeAdapter = new RVPokeAdapter(null,
            R.layout.recycler_view_item,
            new RVPokeAdapter.OnPokemonClickListener()
            {
                @Override
                public void call(String name, int position)
                {
                    Intent intent = new Intent(MainActivity.this,PokemonDetailActivity.class);
                    intent.putExtra("pokeurl",name);
                    startActivity(intent);
                }
            }
        );

        recyclerView.setAdapter(rvPokeAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void addName()
    {
        rvPokeAdapter.getList().add(new Item("TestPokemon",""));
        rvPokeAdapter.notifyItemInserted(this.rvPokeAdapter.getItemCount());
        layoutManager.scrollToPosition(this.rvPokeAdapter.getItemCount()-1);
    }
}

