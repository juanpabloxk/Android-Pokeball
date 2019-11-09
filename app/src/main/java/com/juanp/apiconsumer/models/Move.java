package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Move {

    @SerializedName("move")
    @Expose
    private Move_ move;
    @SerializedName("version_group_details")
    @Expose
    private List<VersionGroupDetail> versionGroupDetails = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Move() {
    }

    /**
     *
     * @param move
     * @param versionGroupDetails
     */
    public Move(Move_ move, List<VersionGroupDetail> versionGroupDetails) {
        super();
        this.move = move;
        this.versionGroupDetails = versionGroupDetails;
    }

    public Move_ getMove() {
        return move;
    }

    public void setMove(Move_ move) {
        this.move = move;
    }

    public List<VersionGroupDetail> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("move", move).append("versionGroupDetails", versionGroupDetails).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(move).append(versionGroupDetails).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Move) == false) {
            return false;
        }
        Move rhs = ((Move) other);
        return new EqualsBuilder().append(move, rhs.move).append(versionGroupDetails, rhs.versionGroupDetails).isEquals();
    }

}
