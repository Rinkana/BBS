package com.mmb;

/**
 * Created by Max on 6-12-2014.
 */
public class Account {
    private String name = "";
    private String surname = "";

    public Account(){

    }

    public Account(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String setName(String value){
        return this.name = value;
    }

    public String setSurname(String value){
        return this.surname = value;
    }
}
