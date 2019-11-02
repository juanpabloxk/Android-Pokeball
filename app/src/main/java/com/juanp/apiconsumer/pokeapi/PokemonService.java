package com.juanp.apiconsumer.pokeapi;

import com.juanp.apiconsumer.models.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonService
{
    @GET("pokemon")
    Call<PokemonResponse> listPokemons();
}
