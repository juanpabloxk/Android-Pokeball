package com.juanp.apiconsumer.models.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
