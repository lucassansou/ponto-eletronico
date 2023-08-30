package com.example.pontoeletronico.service.impl;

import com.example.pontoeletronico.model.Employee;
import com.example.pontoeletronico.repository.EmployeeRepository;
import com.example.pontoeletronico.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee saveOrUpdate(Employee entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return repository.getReferenceById(id);
    }

}
