package com.example.qlproject.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idWork;
    private String workName;
    private String content;
    private String startTime;
    private String endTime;
    private String status;
    @ManyToOne(targetEntity = Project.class)
    @JoinColumn(name = "idProject", referencedColumnName = "idProject")
    private Project project;

    @OneToMany(mappedBy = "idwork", cascade = CascadeType.ALL)
    private Set<Issues> id_issues;

    public Work() {
    }

    public Work(int idWork, String workName, String content, String startTime, String endTime, String status, Project project, Set<Issues> id_issues) {
        this.idWork = idWork;
        this.workName = workName;
        this.content = content;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.project = project;
        this.id_issues = id_issues;
    }

    public int getIdWork() {
        return idWork;
    }

    public void setIdWork(int idWork) {
        this.idWork = idWork;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Set<Issues> getId_issues() {
        return id_issues;
    }

    public void setId_issues(Set<Issues> id_issues) {
        this.id_issues = id_issues;
    }
}
