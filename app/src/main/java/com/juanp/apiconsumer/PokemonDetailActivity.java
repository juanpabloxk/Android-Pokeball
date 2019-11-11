package com.juanp.apiconsumer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.juanp.apiconsumer.models.pokemon.Pokemon;
import com.juanp.apiconsumer.pokeapi.PokeObtainer;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.juanp.apiconsumer.util.ResolutionUtils.dpToPx;
import static com.juanp.apiconsumer.util.StringUtils.getCommaSeparatedString;

public class PokemonDetailActivity extends AppCompatActivity
{
    private TextView tv_name,tv_type;
    private ImageView iv_image;
    private Picasso picasso;
    private int pokeImgWidth,pokeImgHeight;
    private TableLayout tableLayout;
    private LinearLayout scrollViewLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);
        getSupportActionBar().setTitle("Pokemon details");

        picasso = Picasso.get();
        picasso.setLoggingEnabled(true);
        calculateImageDimensions();

        tv_name = findViewById(R.id.tv_lst_pokemon_name);
        tv_type = findViewById(R.id.tv_poke_type);
        iv_image = findViewById(R.id.img_pokemon_sprite);
        //tableLayout = findViewById(R.id.tl_detailsTable);
        scrollViewLayout = findViewById(R.id.scrollViewLayout);

        Intent intent = getIntent();
        if(intent!=null)
        {
            try
            {
                downloadPokemonInfo(intent);
            }
            catch (IllegalArgumentException iae)
            {
                iae.printStackTrace(System.out);
                Toast.makeText(PokemonDetailActivity.this,
                        "Bad pokemon image url...",
                        Toast.LENGTH_LONG).show();
                tv_name.setText("INVALID INFORMATION");
                tv_type.setText("");
            }
            catch (Exception e)
            {
                e.printStackTrace(System.out);
                Toast.makeText(PokemonDetailActivity.this,
                        "Error: "+e.getClass().getName()+" "+e.getMessage(),
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    private void downloadPokemonInfo(Intent intent)
    {
        String url = intent.getExtras().getString("pokeurl");
        PokeObtainer pokeObtainer = new PokeObtainer(url);
        pokeObtainer.obtain(new PokeObtainer.OnPokemonObtained()
        {
            @Override
            public void call(String statusMessage, Pokemon pokemon)
            {
                if(statusMessage.equals(PokeObtainer.SUCCESS))
                {
                    loadPokeInfo(pokemon);
                }
                else
                {
                    Toast.makeText(PokemonDetailActivity.this,
                            "Error getting pokemon, error is: "+statusMessage,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void calculateImageDimensions()
    {
        this.pokeImgHeight = dpToPx(R.dimen.img_pokemon_height);
        this.pokeImgWidth= dpToPx(R.dimen.img_pokemon_height);
    }

    private void loadPokeInfo(final Pokemon pokemon)
    {
        tv_name.setText(pokemon.getName());
        String typesArray = getCommaSeparatedString(pokemon.getTypes());
        tv_type.setText(typesArray);

        String spriteUrl = "https://img.pokemondb.net/artwork/"
                +pokemon.getName().toLowerCase()+".jpg";

        picasso.load(spriteUrl)
            .placeholder(R.mipmap.ic_pokeball_foreground)
            .resize(pokeImgWidth,pokeImgHeight)
            .centerInside()
            .onlyScaleDown()
            .into(iv_image);


        Map<String,List> map = new HashMap<String,List>()
        {{
            put("Abilities:",pokemon.getAbilities());
            put("Forms:",pokemon.getForms());
            put("Moves:",pokemon.getMoves());
            put("Stats:",pokemon.getStats());
        }};

        map.forEach((k,v) ->
        {
            View row = getLayoutInflater().inflate(R.layout.detail_row_item,scrollViewLayout,false);
            TextView titleColumn = row.findViewById(R.id.columnTitle);
            TextView contentColumn = row.findViewById(R.id.columnContent);


            titleColumn.setText(k);
            contentColumn.setText(getCommaSeparatedString(v));

            scrollViewLayout.addView(row);
        });



    }


}
