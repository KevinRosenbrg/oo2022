package com.example.kuulgame.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue
    Long id;
    String name;
    int damage;
    int defence;
    String description;
}
