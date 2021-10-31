package com.example.qlproject.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProject;
    private String projectName;
    private String color;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "accountName", referencedColumnName = "accountName")
    private Account account;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private Set<Work> idWork;

    public Project() {
    }

    public Project(int idProject, String projectName, String color, Account account, Set<Work> idWork) {
        this.idProject = idProject;
        this.projectName = projectName;
        this.color = color;
        this.account = account;
        this.idWork = idWork;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Work> getIdWork() {
        return idWork;
    }

    public void setIdWork(Set<Work> idWork) {
        this.idWork = idWork;
    }
}
