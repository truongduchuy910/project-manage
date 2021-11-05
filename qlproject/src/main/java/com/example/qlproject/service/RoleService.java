package com.example.qlproject.service;

import com.example.qlproject.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> finAll();
    Role findById(int roleId);
    void  delete (int roleId);
    void  create ( Role role);

}
