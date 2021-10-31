package com.example.qlproject.service;

import com.example.qlproject.model.Account;
import com.example.qlproject.model.Work;

import java.util.List;

public interface WorkService {
    List<Work> finAll();
    Work findById(int id);
    void  delete (int id);
    void  create ( Work work);
}
