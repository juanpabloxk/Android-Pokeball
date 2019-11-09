package com.juanp.apiconsumer.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class VersionGroupDetail {

    @SerializedName("level_learned_at")
    @Expose
    private Integer levelLearnedAt;
    @SerializedName("move_learn_method")
    @Expose
    private MoveLearnMethod moveLearnMethod;
    @SerializedName("version_group")
    @Expose
    private VersionGroup versionGroup;

    /**
     * No args constructor for use in serialization
     *
     */
    public VersionGroupDetail() {
    }

    /**
     *
     * @param versionGroup
     * @param levelLearnedAt
     * @param moveLearnMethod
     */
    public VersionGroupDetail(Integer levelLearnedAt, MoveLearnMethod moveLearnMethod, VersionGroup versionGroup) {
        super();
        this.levelLearnedAt = levelLearnedAt;
        this.moveLearnMethod = moveLearnMethod;
        this.versionGroup = versionGroup;
    }

    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("levelLearnedAt", levelLearnedAt).append("moveLearnMethod", moveLearnMethod).append("versionGroup", versionGroup).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(moveLearnMethod).append(versionGroup).append(levelLearnedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionGroupDetail) == false) {
            return false;
        }
        VersionGroupDetail rhs = ((VersionGroupDetail) other);
        return new EqualsBuilder().append(moveLearnMethod, rhs.moveLearnMethod).append(versionGroup, rhs.versionGroup).append(levelLearnedAt, rhs.levelLearnedAt).isEquals();
    }

}
