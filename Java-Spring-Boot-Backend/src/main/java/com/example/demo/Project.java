package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
    @Id
    private Long idProject;
    @Column
    private String name;
    @Column
    private String startDate;
    @Column
    private String deadline;
    @Column
    private String clientName;
    @Column
    private String shortDescription;
    @Column
    private String status;

    @Column
    private Long taskId;
    public Project(){ }

    public Project(Long idProject, String name, String startDate, String deadline, String clientName, String shortDescription, String status, Long taskId) {
        this.idProject = idProject;
        this.name = name;
        this.startDate = startDate;
        this.deadline = deadline;
        this.clientName = clientName;
        this.shortDescription = shortDescription;
        this.status = status;
        this.taskId = taskId;
    }

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}