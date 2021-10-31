package com.example.qlproject.reporitory;

import com.example.qlproject.model.Issues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssuesRepository extends JpaRepository<Issues, Integer> {

}
