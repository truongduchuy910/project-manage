package com.example.qlproject.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {
    @Id
    private  String accountName;
    private  String password;
    private  String fullName;
    private   int age;
    private  int phone;
    private String email;
    private  String birthday;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_accout",
            joinColumns = @JoinColumn(name = "accountName"),
            inverseJoinColumns = @JoinColumn(name = "idRole")
    )
    private Set<Role> role;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private  Issues issues;


    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private  Project project;

    public Account() {
    }

    public Account(String accountName, String password, String fullName, int age, int phone, String email, String birthday, Set<Role> role, Issues issues, Project project) {
        this.accountName = accountName;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.role = role;
        this.issues = issues;
        this.project = project;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    public Issues getIssues() {
        return issues;
    }

    public void setIssues(Issues issues) {
        this.issues = issues;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
