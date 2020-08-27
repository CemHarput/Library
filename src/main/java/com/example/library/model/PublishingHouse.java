package com.example.library.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.OneToMany;
import java.util.Set;

public class PublishingHouse {
    private String publishName;
    private String publishDesc;
    @OneToMany(mappedBy = "publishingHouse")
    private Set<Author> authors;


    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public String getPublishDesc() {
        return publishDesc;
    }

    public void setPublishDesc(String publishDesc) {
        this.publishDesc = publishDesc;
    }

    public PublishingHouse(@JsonProperty("publishName") String publishName,@JsonProperty("publishDesc") String publishDesc) {
        this.publishName = publishName;
        this.publishDesc = publishDesc;
    }
}
