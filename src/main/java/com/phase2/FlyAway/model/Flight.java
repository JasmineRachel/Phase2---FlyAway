package com.phase2.FlyAway.model;

import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;

public class Flight {
    @Id
    @Generated({})
    private String id;

    private String source;
    private String destination;
    private String date;
    private String price;
}
