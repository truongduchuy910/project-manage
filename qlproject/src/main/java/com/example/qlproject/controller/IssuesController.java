package com.example.qlproject.controller;

import com.example.qlproject.model.Issues;
import com.example.qlproject.service.AccountService;
import com.example.qlproject.service.IssuesService;
import com.example.qlproject.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issues")
public class IssuesController {
    @Autowired
    IssuesService issuesService;
//    @Autowired
//    AccountService accountService;
//    @Autowired
//    WorkService workService;

    @GetMapping("/list")
    public ResponseEntity<Object> allIssues(@RequestBody Issues issues) {
        List<Issues> issuesList = issuesService.finAll();
        return new ResponseEntity<>(issuesList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createIssues(@RequestBody Issues issues) {
        this.issuesService.create(issues);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<Object> editIssues(@PathVariable int id, @RequestBody Issues issues) {
        Issues issuesEdit = issuesService.findById(id);
        if (issuesEdit == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        issuesEdit = issues;
        this.issuesService.create(issuesEdit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Object> deleteIssues(@PathVariable int id) {
        Issues issuesDelete = issuesService.findById(id);
        if (issuesDelete == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.issuesService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }


}
