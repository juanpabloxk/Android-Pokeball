package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Pokemon
{

    @SerializedName("abilities")
    @Expose
    private List<Ability> abilities = null;
    @SerializedName("base_experience")
    @Expose
    private Integer baseExperience;
    @SerializedName("forms")
    @Expose
    private List<Form> forms = null;
    @SerializedName("game_indices")
    @Expose
    private List<GameIndex> gameIndices = null;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("held_items")
    @Expose
    private List<HeldItem> heldItems = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("location_area_encounters")
    @Expose
    private String locationAreaEncounters;
    @SerializedName("moves")
    @Expose
    private List<Move> moves = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("species")
    @Expose
    private Species species;
    @SerializedName("sprites")
    @Expose
    private Sprites sprites;
    @SerializedName("stats")
    @Expose
    private List<Stat> stats = null;
    @SerializedName("types")
    @Expose
    private List<Type> types = null;
    @SerializedName("weight")
    @Expose
    private Integer weight;

    /**
     * No args constructor for use in serialization
     *
     */
    public Pokemon() {
    }

    /**
     *
     * @param types
     * @param weight
     * @param sprites
     * @param heldItems
     * @param abilities
     * @param isDefault
     * @param gameIndices
     * @param species
     * @param stats
     * @param moves
     * @param baseExperience
     * @param name
     * @param id
     * @param forms
     * @param height
     * @param locationAreaEncounters
     * @param order
     */
    public Pokemon(List<Ability> abilities, Integer baseExperience, List<Form> forms, List<GameIndex> gameIndices, Integer height, List<HeldItem> heldItems, Integer id, Boolean isDefault, String locationAreaEncounters, List<Move> moves, String name, Integer order, Species species, Sprites sprites, List<Stat> stats, List<Type> types, Integer weight) {
        super();
        this.abilities = abilities;
        this.baseExperience = baseExperience;
        this.forms = forms;
        this.gameIndices = gameIndices;
        this.height = height;
        this.heldItems = heldItems;
        this.id = id;
        this.isDefault = isDefault;
        this.locationAreaEncounters = locationAreaEncounters;
        this.moves = moves;
        this.name = name;
        this.order = order;
        this.species = species;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
        this.weight = weight;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public List<Form> getForms() {
        return forms;
    }

    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<HeldItem> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(List<HeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("abilities", abilities)
                .append("baseExperience", baseExperience).append("forms", forms)
                .append("gameIndices", gameIndices).append("height", height)
                .append("heldItems", heldItems)
                .append("id", id).append("isDefault", isDefault)
                .append("locationAreaEncounters", locationAreaEncounters)
                .append("moves", moves).append("name", name)
                .append("order", order).append("species", species)
                .append("sprites", sprites).append("stats", stats)
                .append("types", types).append("weight", weight)
                .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(types).append(weight)
                .append(sprites).append(heldItems).append(abilities)
                .append(isDefault).append(gameIndices).append(species)
                .append(stats).append(moves).append(baseExperience)
                .append(name).append(id).append(forms).append(height)
                .append(locationAreaEncounters).append(order).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pokemon) == false) {
            return false;
        }
        Pokemon rhs = ((Pokemon) other);
        return new EqualsBuilder().append(types, rhs.types).append(weight, rhs.weight).append(sprites, rhs.sprites).append(heldItems, rhs.heldItems).append(abilities, rhs.abilities).append(isDefault, rhs.isDefault).append(gameIndices, rhs.gameIndices).append(species, rhs.species).append(stats, rhs.stats).append(moves, rhs.moves).append(baseExperience, rhs.baseExperience).append(name, rhs.name).append(id, rhs.id).append(forms, rhs.forms).append(height, rhs.height).append(locationAreaEncounters, rhs.locationAreaEncounters).append(order, rhs.order).isEquals();
    }

}