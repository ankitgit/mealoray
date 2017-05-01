package com.ankit.mealoray.model;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class User {

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

}
