package com.pokedex.Pokedexpokemon.pokemonRepository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pokedex.Pokedexpokemon.model.Pokemon;

@RepositoryRestResource(collectionResourceRel = "Pokemon", path = "Pokemon")
public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, Integer>{
    
}
