package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Task {
    @Id
    private Long idTask;
    @Column
    private String name;
    @Column
    private String specifikacija;
    @Column
    private String status;
    @Column
    private String deadLine;

    @Column
    private Long idTaska;

    public Task(Long idTask, String name, String specifikacija, String status, String deadLine, Long idTaska) {
        this.idTask = idTask;
        this.name = name;
        this.specifikacija = specifikacija;
        this.status = status;
        this.deadLine = deadLine;
        this.idTaska = idTaska;
    }

    public Long getIdTask() {
        return idTask;
    }

    public void setIdTask(Long idTask) {
        this.idTask = idTask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecifikacija() {
        return specifikacija;
    }

    public void setSpecifikacija(String specifikacija) {
        this.specifikacija = specifikacija;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public Long getIdTaska() {
        return idTaska;
    }

    public void setIdTaska(Long idTaska) {
        this.idTaska = idTaska;
    }
}
