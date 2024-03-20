package com.example.restapidemo;

public class Owner {
    private int id;
    private String name;
    private Dog dog;

    public Owner() {
    }

    public Owner(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Owner(int id, String name, Dog dog) {
        this.id = id;
        this.name = name;
        this.dog = dog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
