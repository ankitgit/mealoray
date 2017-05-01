package com.ankit.mealoray.model;

import java.util.List;
import java.util.UUID;

public class Group {

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
}
