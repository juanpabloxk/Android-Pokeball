package com.juanp.apiconsumer.models.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
