package com.fitFusion.springbootlibrary.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Customer {

    @EmbeddedId
    private CustomerId id;

    public Customer(String userId, String fitnessPlanId) {
        this.id = new CustomerId(Long.valueOf(userId), Long.valueOf(fitnessPlanId));

    }

    public Customer() {}
}

