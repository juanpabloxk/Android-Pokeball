package com.juanp.apiconsumer.pokeapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.juanp.apiconsumer.models.pokemon.Item;
import com.juanp.apiconsumer.models.pokemon.Pokemon;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class PokeList
{

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<Item> list = null;


    public PokeList() {
    }

    public PokeList(Integer count, String next, Object previous, List<Item> list) {
        super();
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.list = list;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<Item> getList() {
        return list;
    }

    public void setResults(List<Item> results) {
        this.list = results;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).append("next", next)
                .append("previous", previous).append("list", list).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(next).append(previous)
                .append(list).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PokeList) == false) {
            return false;
        }
        PokeList rhs = ((PokeList) other);
        return new EqualsBuilder().append(count, rhs.count).append(next, rhs.next)
                .append(previous, rhs.previous).append(list, rhs.list).isEquals();
    }
}
