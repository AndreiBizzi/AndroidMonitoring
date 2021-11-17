package com.example.androidmonitoring.Model;

import javax.persistence.*;

@Entity
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "model")
    private String model;

    @Column(name="producator")
    private String producator;

    @Column(name = "versiune_android")
    private String versiune_android;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getVersiuneAndroid() {
        return versiune_android;
    }

    public void setVersiuneAndroid(String versiune_android) {
        this.versiune_android = versiune_android;
    }

}