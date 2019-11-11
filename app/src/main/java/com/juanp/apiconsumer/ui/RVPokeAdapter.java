package com.juanp.apiconsumer.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juanp.apiconsumer.R;
import com.juanp.apiconsumer.models.pokemon.Item;

import java.util.List;

public class RVPokeAdapter extends RecyclerView.Adapter<RVPokeAdapter.PokeViewHolder>
{
    private List<Item> list;
    private int layout;
    private OnPokemonClickListener itemClickListener;


    public RVPokeAdapter(List<Item> list, int layout, OnPokemonClickListener itemClickListener)
    {
        this.list = list;
        this.layout = layout;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public PokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        PokeViewHolder vh = new PokeViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull PokeViewHolder holder, int position)
    {
        holder.bind(list.get(position),itemClickListener);
    }


    @Override
    public int getItemCount()
    {
        if(list!=null) {return list.size();}
        else {return 0;}
    }

    public static class PokeViewHolder extends RecyclerView.ViewHolder
    {
        public TextView tv_name;

        public PokeViewHolder(View v)
        {
            super(v);
            tv_name = v.findViewById(R.id.tv_lst_pokemon_name);
        }

        public void bind(final Item item, final OnPokemonClickListener onItemClickListener)
        {
            String pokeName = item.getName();
            String capName = pokeName.substring(0,1).toUpperCase()+pokeName.substring(1);
            this.tv_name.setText(capName);
            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    onItemClickListener.call(item.getUrl(),getAdapterPosition());
                }
            });
        }
    }

    public void setList(List<Item> list)
    {
        this.list = list;
    }

    public List<Item> getList()
    {
        return list;
    }

    public interface OnPokemonClickListener
    {
        void call(String name, int position);
    }
}