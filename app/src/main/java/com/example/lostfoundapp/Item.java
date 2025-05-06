
package com.example.lostfoundapp;

public class Item {
    int id;
    String type;
    String name;
    String phone;
    String description;
    String date;
    String location;

    public Item(int id, String type, String name, String phone, String description, String date, String location) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.date = date;
        this.location = location;
    }
}
