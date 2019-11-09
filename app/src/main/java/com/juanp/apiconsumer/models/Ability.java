package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Ability
{

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
