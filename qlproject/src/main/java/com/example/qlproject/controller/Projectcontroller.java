package com.example.qlproject.controller;

import com.example.qlproject.model.Issues;
import com.example.qlproject.model.Project;
import com.example.qlproject.service.AccountService;
import com.example.qlproject.service.ProjectService;
import com.example.qlproject.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Projectcontroller {
    @Autowired
    ProjectService projectService;
//    @Autowired
//    WorkService workService;
//    @Autowired
//    AccountService accountService;


    @GetMapping("/projects/list")
    public ResponseEntity<Object> allIssues(@RequestBody(required = false) Project project) {
        List<Project> projectList = projectService.finAll();
        return new ResponseEntity<>(projectList, HttpStatus.OK);
    }

    @PostMapping("/projects/create")
    public ResponseEntity<Void> createIssues(@RequestBody(required = false) Project project) {
        this.projectService.create(project);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/projects/edit/{id}")
    public ResponseEntity<Object> eidtIssues(@PathVariable int id, @RequestBody(required = false) Project project) {
        Project projectById = projectService.findById(id);
        if (projectById == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        projectById = project;
        this.projectService.create(projectById);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/projects/delete/{id}")
    public ResponseEntity<Object> deleteIssues(@PathVariable int id) {
        Project projectById = projectService.findById(id);
        if (projectById == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.projectService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

}
