package com.ankit.mealoray.model;

import com.ankit.mealoray.utils.JsonNode;

import java.util.List;
import java.util.UUID;

public class Group extends JsonNode {

    final String id;
    final String name;
    List<User> users;

    public Group(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public void addMember(User user) {
        users.add(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (id != null ? !id.equals(group.id) : group.id != null) return false;
        if (name != null ? !name.equals(group.name) : group.name != null) return false;
        return users != null ? users.equals(group.users) : group.users == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (users != null ? users.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
