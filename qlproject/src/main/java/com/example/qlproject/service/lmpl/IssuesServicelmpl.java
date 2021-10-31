package com.example.qlproject.service.lmpl;

import com.example.qlproject.model.Issues;
import com.example.qlproject.model.Project;
import com.example.qlproject.reporitory.IssuesRepository;
import com.example.qlproject.service.IssuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssuesServicelmpl implements IssuesService {

    @Autowired
    private IssuesRepository issuesRepository;

    @Override
    public List<Issues> finAll() {
        return issuesRepository.findAll();
    }

    @Override
    public Issues findById(int id) {
        return issuesRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        issuesRepository.deleteById(id);

    }

    @Override
    public void create(Issues issues) {

        issuesRepository.save(issues);
    }
}
