package com.vincevitale.mywebapp;

public class DataModel {
    String name;
    int image;
    int id_;

    public DataModel(String name, int id_, int image){
        this.name = name;
        this.image = image;
        this.id_ = id_;
    }

    public String getName(){return name;}

    public int getImage(){return image;}

    public int getId(){return id_;}
}
