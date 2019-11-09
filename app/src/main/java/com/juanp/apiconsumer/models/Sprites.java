package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
