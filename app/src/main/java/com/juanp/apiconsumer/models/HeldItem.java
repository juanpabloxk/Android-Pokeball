package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

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
