package com.juanp.apiconsumer.pokeapi;

import android.util.Log;

import com.juanp.apiconsumer.models.pokemon.Pokemon;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokeObtainer
{
    private Retrofit retrofit;
    private PokemonService pokemonService;


    public final static String SUCCESS="SUCCESS";
    private String apiUrl;

    public PokeObtainer(String apiURL)
    {
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(apiURL)
                .build();
        this.apiUrl = apiURL;
        pokemonService = retrofit.create(PokemonService.class);
    }

    public void obtain(final OnPokemonObtained onPokemonObtained)
    {
        Call<Pokemon> pokeListCall = pokemonService.getPokemon(apiUrl);
        pokeListCall.enqueue(new Callback<Pokemon>()
        {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response)
            {
                onPokemonObtained.call(SUCCESS,response.body());
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t)
            {
                onPokemonObtained.call(t.getMessage(),null);
                t.printStackTrace(System.out);
                Log.e("Pokerror","Error getting pokemon data",t);
            }
        });
    }

    public interface OnPokemonObtained
    {
        void call(String statusMessage,Pokemon pokemon);
    }
}
