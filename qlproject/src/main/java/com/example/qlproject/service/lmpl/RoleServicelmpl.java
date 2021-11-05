package com.example.qlproject.service.lmpl;

import com.example.qlproject.model.Role;
import com.example.qlproject.reporitory.RoleRepository;
import com.example.qlproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServicelmpl  implements RoleService {
    @Autowired
    public RoleRepository roleRepository;
    @Override
    public List<Role> finAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(int roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    @Override
    public void delete(int roleId) {
        roleRepository.deleteById(roleId);
    }

    @Override
    public void create(Role role) {
        roleRepository.save(role);
    }
}
