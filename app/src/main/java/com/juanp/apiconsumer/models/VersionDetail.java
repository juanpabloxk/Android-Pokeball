package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
