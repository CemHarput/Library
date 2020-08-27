package com.example.library.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long isbn;

    private String bName;
    private String bSubName;
    private String bSerialName;
    private String Author;
    private String PublishHouse;

    private String desc;




    public Book() {

    }



    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbSubName() {
        return bSubName;
    }

    public void setbSubName(String bSubName) {
        this.bSubName = bSubName;
    }

    public String getbSerialName() {
        return bSerialName;
    }

    public void setbSerialName(String bSerialName) {
        this.bSerialName = bSerialName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublishHouse() {
        return PublishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        PublishHouse = publishHouse;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
