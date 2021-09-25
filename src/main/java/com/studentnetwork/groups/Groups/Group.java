package com.studentnetwork.groups.Groups;

import com.studentnetwork.groups.Groups.database.PostDB;

import java.util.List;

public class Group {

    private int groupId;
    private String groupName;
    private List<PostDB> groupPostDBS;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<PostDB> getGroupPosts() {
        return groupPostDBS;
    }

    public void setGroupPosts(List<PostDB> groupPostDBS) {
        this.groupPostDBS = groupPostDBS;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Group (){

    }

    public Group(int groupId, String groupName, List<PostDB> groupPostDBS) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupPostDBS = groupPostDBS;
    }
}
