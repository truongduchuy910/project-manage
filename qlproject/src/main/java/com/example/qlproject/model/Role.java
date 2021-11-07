package com.example.qlproject.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idRole")

    private  int id;

    private  String roleName;

//    @ManyToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Set<Account> account;

    public Role() {
    }

    public Role(int id, Set<Account> account) {
        this.id = id;
//        this.account = account;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Set<Account> getAccount() {
//        return account;
//    }
//
//    public void setAccount(Set<Account> account) {
//        this.account = account;
//    }
}
