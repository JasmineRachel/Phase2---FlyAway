package com.phase2.FlyAway.model;

import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;

public class Booking {
    @Id
    @Generated({})
    private String id;

    private String customerName;
    private String address;
    private String flightId;
}
