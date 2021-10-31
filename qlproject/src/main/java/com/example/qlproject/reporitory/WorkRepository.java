package com.example.qlproject.reporitory;

import com.example.qlproject.model.Account;
import com.example.qlproject.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository   extends JpaRepository<Work, Integer> {
}
