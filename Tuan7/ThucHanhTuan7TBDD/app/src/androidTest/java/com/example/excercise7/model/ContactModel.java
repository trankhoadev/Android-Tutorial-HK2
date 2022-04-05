package com.example.excercise7.model;

public class ContactModel {
    int id;
    String name;

    public ContactModel() {
    }

    public ContactModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ContactModel(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "ContactModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
