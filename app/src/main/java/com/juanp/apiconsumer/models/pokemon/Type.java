package com.juanp.apiconsumer.models.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
        return this.type.getName();
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
