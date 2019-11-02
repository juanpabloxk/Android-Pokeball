package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

-----------------------------------com.juanp.apiconsumer.models.Ability.java-----------------------------------

        package com.juanp.apiconsumer.models;

public class Ability {

    @SerializedName("ability")
    @Expose
    private Ability_ ability;
    @SerializedName("is_hidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("slot")
    @Expose
    private Integer slot;

    /**
     * No args constructor for use in serialization
     *
     */
    public Ability() {
    }

    /**
     *
     * @param ability
     * @param slot
     * @param isHidden
     */
    public Ability(Ability_ ability, Boolean isHidden, Integer slot) {
        super();
        this.ability = ability;
        this.isHidden = isHidden;
        this.slot = slot;
    }

    public Ability_ getAbility() {
        return ability;
    }

    public void setAbility(Ability_ ability) {
        this.ability = ability;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ability", ability).append("isHidden", isHidden).append("slot", slot).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ability).append(slot).append(isHidden).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ability) == false) {
            return false;
        }
        Ability rhs = ((Ability) other);
        return new EqualsBuilder().append(ability, rhs.ability).append(slot, rhs.slot).append(isHidden, rhs.isHidden).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Ability_.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Ability_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Ability_() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Ability_(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ability_) == false) {
            return false;
        }
        Ability_ rhs = ((Ability_) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Form.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Form {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Form() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Form(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Form) == false) {
            return false;
        }
        Form rhs = ((Form) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.GameIndex.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class GameIndex {

    @SerializedName("game_index")
    @Expose
    private Integer gameIndex;
    @SerializedName("version")
    @Expose
    private Version version;

    /**
     * No args constructor for use in serialization
     *
     */
    public GameIndex() {
    }

    /**
     *
     * @param gameIndex
     * @param version
     */
    public GameIndex(Integer gameIndex, Version version) {
        super();
        this.gameIndex = gameIndex;
        this.version = version;
    }

    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gameIndex", gameIndex).append("version", version).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(version).append(gameIndex).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameIndex) == false) {
            return false;
        }
        GameIndex rhs = ((GameIndex) other);
        return new EqualsBuilder().append(version, rhs.version).append(gameIndex, rhs.gameIndex).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.HeldItem.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import java.util.List;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class HeldItem {

    @SerializedName("item")
    @Expose
    private Item item;
    @SerializedName("version_details")
    @Expose
    private List<VersionDetail> versionDetails = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public HeldItem() {
    }

    /**
     *
     * @param item
     * @param versionDetails
     */
    public HeldItem(Item item, List<VersionDetail> versionDetails) {
        super();
        this.item = item;
        this.versionDetails = versionDetails;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<VersionDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<VersionDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("item", item).append("versionDetails", versionDetails).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(versionDetails).append(item).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HeldItem) == false) {
            return false;
        }
        HeldItem rhs = ((HeldItem) other);
        return new EqualsBuilder().append(versionDetails, rhs.versionDetails).append(item, rhs.item).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Item.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Item {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Item() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Item(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Move.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import java.util.List;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Move {

    @SerializedName("move")
    @Expose
    private Move_ move;
    @SerializedName("version_group_details")
    @Expose
    private List<VersionGroupDetail> versionGroupDetails = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Move() {
    }

    /**
     *
     * @param move
     * @param versionGroupDetails
     */
    public Move(Move_ move, List<VersionGroupDetail> versionGroupDetails) {
        super();
        this.move = move;
        this.versionGroupDetails = versionGroupDetails;
    }

    public Move_ getMove() {
        return move;
    }

    public void setMove(Move_ move) {
        this.move = move;
    }

    public List<VersionGroupDetail> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("move", move).append("versionGroupDetails", versionGroupDetails).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(move).append(versionGroupDetails).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Move) == false) {
            return false;
        }
        Move rhs = ((Move) other);
        return new EqualsBuilder().append(move, rhs.move).append(versionGroupDetails, rhs.versionGroupDetails).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.MoveLearnMethod.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class MoveLearnMethod {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public MoveLearnMethod() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public MoveLearnMethod(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MoveLearnMethod) == false) {
            return false;
        }
        MoveLearnMethod rhs = ((MoveLearnMethod) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Move_.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Move_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Move_() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Move_(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Move_) == false) {
            return false;
        }
        Move_ rhs = ((Move_) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Pokemon.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import java.util.List;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Pokemon {

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
        return new ToStringBuilder(this).append("abilities", abilities).append("baseExperience", baseExperience).append("forms", forms).append("gameIndices", gameIndices).append("height", height).append("heldItems", heldItems).append("id", id).append("isDefault", isDefault).append("locationAreaEncounters", locationAreaEncounters).append("moves", moves).append("name", name).append("order", order).append("species", species).append("sprites", sprites).append("stats", stats).append("types", types).append("weight", weight).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(types).append(weight).append(sprites).append(heldItems).append(abilities).append(isDefault).append(gameIndices).append(species).append(stats).append(moves).append(baseExperience).append(name).append(id).append(forms).append(height).append(locationAreaEncounters).append(order).toHashCode();
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
-----------------------------------com.juanp.apiconsumer.models.Species.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Species {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Species() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Species(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Species) == false) {
            return false;
        }
        Species rhs = ((Species) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Sprites.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Sprites {

    @SerializedName("back_default")
    @Expose
    private String backDefault;
    @SerializedName("back_female")
    @Expose
    private String backFemale;
    @SerializedName("back_shiny")
    @Expose
    private String backShiny;
    @SerializedName("back_shiny_female")
    @Expose
    private String backShinyFemale;
    @SerializedName("front_default")
    @Expose
    private String frontDefault;
    @SerializedName("front_female")
    @Expose
    private String frontFemale;
    @SerializedName("front_shiny")
    @Expose
    private String frontShiny;
    @SerializedName("front_shiny_female")
    @Expose
    private String frontShinyFemale;

    /**
     * No args constructor for use in serialization
     *
     */
    public Sprites() {
    }

    /**
     *
     * @param frontShinyFemale
     * @param backFemale
     * @param frontShiny
     * @param backDefault
     * @param frontDefault
     * @param frontFemale
     * @param backShinyFemale
     * @param backShiny
     */
    public Sprites(String backDefault, String backFemale, String backShiny, String backShinyFemale, String frontDefault, String frontFemale, String frontShiny, String frontShinyFemale) {
        super();
        this.backDefault = backDefault;
        this.backFemale = backFemale;
        this.backShiny = backShiny;
        this.backShinyFemale = backShinyFemale;
        this.frontDefault = frontDefault;
        this.frontFemale = frontFemale;
        this.frontShiny = frontShiny;
        this.frontShinyFemale = frontShinyFemale;
    }

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public String getBackFemale() {
        return backFemale;
    }

    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    public String getBackShiny() {
        return backShiny;
    }

    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public String getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backDefault", backDefault).append("backFemale", backFemale).append("backShiny", backShiny).append("backShinyFemale", backShinyFemale).append("frontDefault", frontDefault).append("frontFemale", frontFemale).append("frontShiny", frontShiny).append("frontShinyFemale", frontShinyFemale).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(frontShinyFemale).append(backFemale).append(frontShiny).append(backDefault).append(frontDefault).append(frontFemale).append(backShinyFemale).append(backShiny).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sprites) == false) {
            return false;
        }
        Sprites rhs = ((Sprites) other);
        return new EqualsBuilder().append(frontShinyFemale, rhs.frontShinyFemale).append(backFemale, rhs.backFemale).append(frontShiny, rhs.frontShiny).append(backDefault, rhs.backDefault).append(frontDefault, rhs.frontDefault).append(frontFemale, rhs.frontFemale).append(backShinyFemale, rhs.backShinyFemale).append(backShiny, rhs.backShiny).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Stat.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Stat {

    @SerializedName("base_stat")
    @Expose
    private Integer baseStat;
    @SerializedName("effort")
    @Expose
    private Integer effort;
    @SerializedName("stat")
    @Expose
    private Stat_ stat;

    /**
     * No args constructor for use in serialization
     *
     */
    public Stat() {
    }

    /**
     *
     * @param stat
     * @param baseStat
     * @param effort
     */
    public Stat(Integer baseStat, Integer effort, Stat_ stat) {
        super();
        this.baseStat = baseStat;
        this.effort = effort;
        this.stat = stat;
    }

    public Integer getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public Stat_ getStat() {
        return stat;
    }

    public void setStat(Stat_ stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseStat", baseStat).append("effort", effort).append("stat", stat).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(effort).append(stat).append(baseStat).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stat) == false) {
            return false;
        }
        Stat rhs = ((Stat) other);
        return new EqualsBuilder().append(effort, rhs.effort).append(stat, rhs.stat).append(baseStat, rhs.baseStat).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Stat_.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Stat_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Stat_() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Stat_(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stat_) == false) {
            return false;
        }
        Stat_ rhs = ((Stat_) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Type.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Type {

    @SerializedName("slot")
    @Expose
    private Integer slot;
    @SerializedName("type")
    @Expose
    private Type_ type;

    /**
     * No args constructor for use in serialization
     *
     */
    public Type() {
    }

    /**
     *
     * @param slot
     * @param type
     */
    public Type(Integer slot, Type_ type) {
        super();
        this.slot = slot;
        this.type = type;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Type_ getType() {
        return type;
    }

    public void setType(Type_ type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("slot", slot).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(slot).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type) == false) {
            return false;
        }
        Type rhs = ((Type) other);
        return new EqualsBuilder().append(type, rhs.type).append(slot, rhs.slot).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Type_.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Type_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Type_() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Type_(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type_) == false) {
            return false;
        }
        Type_ rhs = ((Type_) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Version.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Version {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Version() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Version(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Version) == false) {
            return false;
        }
        Version rhs = ((Version) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.VersionDetail.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class VersionDetail {

    @SerializedName("rarity")
    @Expose
    private Integer rarity;
    @SerializedName("version")
    @Expose
    private Version_ version;

    /**
     * No args constructor for use in serialization
     *
     */
    public VersionDetail() {
    }

    /**
     *
     * @param version
     * @param rarity
     */
    public VersionDetail(Integer rarity, Version_ version) {
        super();
        this.rarity = rarity;
        this.version = version;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Version_ getVersion() {
        return version;
    }

    public void setVersion(Version_ version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rarity", rarity).append("version", version).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(version).append(rarity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionDetail) == false) {
            return false;
        }
        VersionDetail rhs = ((VersionDetail) other);
        return new EqualsBuilder().append(version, rhs.version).append(rarity, rhs.rarity).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.VersionGroup.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class VersionGroup {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public VersionGroup() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public VersionGroup(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionGroup) == false) {
            return false;
        }
        VersionGroup rhs = ((VersionGroup) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.VersionGroupDetail.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class VersionGroupDetail {

    @SerializedName("level_learned_at")
    @Expose
    private Integer levelLearnedAt;
    @SerializedName("move_learn_method")
    @Expose
    private MoveLearnMethod moveLearnMethod;
    @SerializedName("version_group")
    @Expose
    private VersionGroup versionGroup;

    /**
     * No args constructor for use in serialization
     *
     */
    public VersionGroupDetail() {
    }

    /**
     *
     * @param versionGroup
     * @param levelLearnedAt
     * @param moveLearnMethod
     */
    public VersionGroupDetail(Integer levelLearnedAt, MoveLearnMethod moveLearnMethod, VersionGroup versionGroup) {
        super();
        this.levelLearnedAt = levelLearnedAt;
        this.moveLearnMethod = moveLearnMethod;
        this.versionGroup = versionGroup;
    }

    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("levelLearnedAt", levelLearnedAt).append("moveLearnMethod", moveLearnMethod).append("versionGroup", versionGroup).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(moveLearnMethod).append(versionGroup).append(levelLearnedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionGroupDetail) == false) {
            return false;
        }
        VersionGroupDetail rhs = ((VersionGroupDetail) other);
        return new EqualsBuilder().append(moveLearnMethod, rhs.moveLearnMethod).append(versionGroup, rhs.versionGroup).append(levelLearnedAt, rhs.levelLearnedAt).isEquals();
    }

}
-----------------------------------com.juanp.apiconsumer.models.Version_.java-----------------------------------

        package com.juanp.apiconsumer.models;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
        import org.apache.commons.lang.builder.EqualsBuilder;
        import org.apache.commons.lang.builder.HashCodeBuilder;
        import org.apache.commons.lang.builder.ToStringBuilder;

public class Version_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Version_() {
    }

    /**
     *
     * @param name
     * @param url
     */
    public Version_(String name, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Version_) == false) {
            return false;
        }
        Version_ rhs = ((Version_) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).isEquals();
    }

}