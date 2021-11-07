package com.example.qlproject.reporitory;

import com.example.qlproject.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Query("select e from Project e ")
    List<Project> finAdll1();
}
