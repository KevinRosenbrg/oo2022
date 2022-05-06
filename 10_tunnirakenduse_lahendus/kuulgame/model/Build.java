package com.example.kuulgame.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Build {
    @Id
    @GeneratedValue
    Long id;
    String item1;
    String item2;
    String item3;
    String item4;
}
