package com.ankit.mealoray.model;

import com.ankit.mealoray.utils.JsonNode;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class User extends JsonNode{

    final String id;
    final String emailAddress;
    String name;
    String description;
    ConcurrentMap<String, String> profile = new ConcurrentHashMap();

    public User(String emailAddress) {
        this.id = UUID.randomUUID().toString();
        this.emailAddress = emailAddress;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addProfileInfo(String key, String value){
        this.profile.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (emailAddress != null ? !emailAddress.equals(user.emailAddress) : user.emailAddress != null)
            return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (description != null ? !description.equals(user.description) : user.description != null)
            return false;
        return profile != null ? profile.equals(user.profile) : user.profile == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (profile != null ? profile.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", profile=" + profile +
                '}';
    }
}
