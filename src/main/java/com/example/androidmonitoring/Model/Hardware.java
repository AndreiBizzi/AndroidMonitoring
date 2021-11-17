package com.example.androidmonitoring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hardware")
public class Hardware {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Integer getRamLoad() {
        return ramLoad;
    }

    public void setRamLoad(Integer ramLoad) {
        this.ramLoad = ramLoad;
    }

    public Integer getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(Integer cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    private Integer ramLoad;
    private Integer cpuLoad;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
