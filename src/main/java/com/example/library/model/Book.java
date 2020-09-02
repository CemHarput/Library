package com.example.library.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;
@Data
@Entity
public class Book {

    @Id
    private UUID id;

    private String bName;
    private String bSubName;
    private String bSerialName;
    @ManyToOne
    private Author Author;

    @ManyToOne
    private PublishingHouse PublishHouse;

    private long isbn;
    private String desc;

    public Book() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public com.example.library.model.Author getAuthor() {
        return Author;
    }

    public void setAuthor(com.example.library.model.Author author) {
        Author = author;
    }

    public PublishingHouse getPublishHouse() {
        return PublishHouse;
    }

    public void setPublishHouse(PublishingHouse publishHouse) {
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
