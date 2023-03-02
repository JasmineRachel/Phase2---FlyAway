package com.phase2.FlyAway.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id

    private String id;

    private String name;
    private String password;
}
