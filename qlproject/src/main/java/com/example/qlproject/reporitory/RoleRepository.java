package com.example.qlproject.reporitory;

import com.example.qlproject.model.Account;
import com.example.qlproject.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
