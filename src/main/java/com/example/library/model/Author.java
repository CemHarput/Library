package com.example.library.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Data
@Entity

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="author_name")
    private String name;

    private String desc;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="author_name",referencedColumnName = "author_name")
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
