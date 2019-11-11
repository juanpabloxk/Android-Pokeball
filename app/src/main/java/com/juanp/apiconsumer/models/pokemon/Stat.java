package com.juanp.apiconsumer.models.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
        return stat.getName()+":"+baseStat;
        //return new ToStringBuilder(this).append("baseStat", baseStat).append("effort", effort).append("stat", stat).toString();
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
