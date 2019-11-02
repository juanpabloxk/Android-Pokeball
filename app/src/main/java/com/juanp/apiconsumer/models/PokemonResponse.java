package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class PokemonResponse {

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
    private List<Pokemon> results = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public PokemonResponse() {
    }

    /**
     *
     * @param next
     * @param previous
     * @param count
     * @param results
     */
    public PokemonResponse(Integer count, String next, Object previous, List<Pokemon> results) {
        super();
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
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

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).append("next", next)
                .append("previous", previous).append("results", results).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(next).append(previous)
                .append(results).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PokemonResponse) == false) {
            return false;
        }
        PokemonResponse rhs = ((PokemonResponse) other);
        return new EqualsBuilder().append(count, rhs.count).append(next, rhs.next)
                .append(previous, rhs.previous).append(results, rhs.results).isEquals();
    }
}
