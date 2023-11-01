package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.micrometer.common.lang.NonNull;

public class Person {
    private final UUID id;
    @NonNull
    private final String name;
    @NonNull
    private final int age;

    public Person(@JsonProperty("id") UUID _id, 
                  @JsonProperty("name") String _name, 
                  @JsonProperty("age") int _age){
        id = _id;
        name = _name;
        age = _age;
    }

    public UUID getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
