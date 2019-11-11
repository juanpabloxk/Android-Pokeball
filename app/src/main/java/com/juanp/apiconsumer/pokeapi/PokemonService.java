package com.juanp.apiconsumer.pokeapi;

import com.juanp.apiconsumer.models.pokemon.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface PokemonService
{
    @GET("pokemon?limit=150")
    Call<PokeList> listPokemons();

    @GET("pokemon/{pokemon_id}/")
    Call<Pokemon> getPokemon(@Path("pokemon_id") int pokemonId);

    @GET
    Call<Pokemon> getPokemon(@Url String url);
}
