package com.example.qlproject.service;

import com.example.qlproject.model.Account;
import com.example.qlproject.model.Issues;
import com.example.qlproject.model.Project;

import java.util.List;

public interface IssuesService {
    List<Issues> finAll();
    Issues findById(int id);
    void  delete (int id);
    void  create ( Issues issues);
}
