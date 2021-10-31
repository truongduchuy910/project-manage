package com.example.qlproject.service.lmpl;

import com.example.qlproject.model.Project;
import com.example.qlproject.reporitory.ProjectRepository;
import com.example.qlproject.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServicelmpl  implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> finAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project findById(int id) {
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        projectRepository.deleteById(id);

    }

    @Override
    public void create(Project project) {
        projectRepository.save(project);

    }
}
