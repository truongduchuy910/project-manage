package com.example.qlproject.controller;

import com.example.qlproject.model.Issues;
import com.example.qlproject.model.Work;
import com.example.qlproject.service.IssuesService;
import com.example.qlproject.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.ICDATASection;

import java.util.List;

@RestController


public class WorkController {
    @Autowired
    WorkService workService;
//    @Autowired
//    IssuesService issuesService;


    @GetMapping("/work/list")
    public ResponseEntity<Object> allIssues(@RequestBody(required = false) Work work) {
        List<Work> workList = workService.finAll();
        return new ResponseEntity<>(workList, HttpStatus.OK);
    }

    @PostMapping("/work/create")
    public ResponseEntity<Void> createIssues(@RequestBody(required = false) Work work) {
        this.workService.create(work);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/work/edit/{id}")
    public ResponseEntity<Object> eidtIssues(@PathVariable int id, @RequestBody(required = false) Work work) {
        Work workEdit = workService.findById(id);
        if (workEdit == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        workEdit = work;
        this.workService.create(workEdit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/work/delete/{id}")
    public ResponseEntity<Object> deleteIssues(@PathVariable int id) {
        Work workDelete = workService.findById(id);
        if (workDelete == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.workService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

}
