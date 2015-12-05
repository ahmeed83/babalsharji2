package com.domain.model;

import javax.persistence.*;

/**
 * Ahmed Aziz on 05/12/15 10:14 .
 */

@Entity
@Table(name = "T_ADVER")
public class Adver {

    @Id
    @GeneratedValue
    @Column(name = "ADVER_ID", unique = true, nullable = false)
    String id;

    @Column(name = "ADVER_NAME", nullable = false)
    String name;

    @Column(name = "ADVER_CONTENT", nullable = true)
    String content;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
