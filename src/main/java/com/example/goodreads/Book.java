package com.example.goodreads;

public class Book{
    private int id;
    private String name;
    private String imageUrl;

    public Book(int id, String name, String imageUrl){
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public int getId(){
        return id;
    }
    public int setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name = name;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public String setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
}