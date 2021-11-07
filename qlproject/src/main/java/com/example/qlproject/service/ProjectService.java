package com.example.qlproject.service;

import com.example.qlproject.model.Account;
import com.example.qlproject.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProjectService {
    List<Project> finAll();
    Project findById(int id);
    void  delete (int id);
    void  create ( Project project);
}
