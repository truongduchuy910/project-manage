package com.example.qlproject.service.lmpl;


import com.example.qlproject.model.Work;
import com.example.qlproject.reporitory.WorkRepository;
import com.example.qlproject.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServicelmpl implements WorkService {
    @Autowired
    private WorkRepository workRepository;

    @Override
    public List<Work> finAll() {
        return workRepository.findAll();
    }

    @Override
    public Work findById(int id) {
        return workRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        workRepository.deleteById(id);

    }

    @Override
    public void create(Work work) {
        workRepository.save(work);

    }
}
