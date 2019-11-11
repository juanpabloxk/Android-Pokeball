package com.juanp.apiconsumer.pokeapi;

import android.content.res.Resources;
import android.util.Log;

import com.juanp.apiconsumer.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokeListObtainer
{
    private Retrofit retrofit;
    private PokemonService pokemonService;


    public final static String SUCCESS="SUCCESS";

    public PokeListObtainer(String apiURL)
    {
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(apiURL)
                .build();
        pokemonService = retrofit.create(PokemonService.class);
    }

    public void obtain(final OnPokeListObtained pokemonsObtainedCallback)
    {
        Call<PokeList> pokeListCall = pokemonService.listPokemons();
        pokeListCall.enqueue(new Callback<PokeList>()
        {
            @Override
            public void onResponse(Call<PokeList> call, Response<PokeList> response)
            {
                pokemonsObtainedCallback.call(SUCCESS,response.body());
            }

            @Override
            public void onFailure(Call<PokeList> call, Throwable t)
            {
                pokemonsObtainedCallback.call(t.getClass().getName()
                        +" "+t.getMessage(),null);
            }
        });
    }

    public interface OnPokeListObtained
    {
        void call(String statusMessage,PokeList pokeList);
    }

}
