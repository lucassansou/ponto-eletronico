package com.example.pontoeletronico.controller;

import com.example.pontoeletronico.model.Employee;
import com.example.pontoeletronico.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmplpyeeController {

    @Autowired
    private EmployeeServiceImpl service;

    @GetMapping("/api/employees")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @PostMapping("/api/employee")
    public Employee save(Employee employee) {
        return service.saveOrUpdate(employee);
    }

    @PutMapping("/api/employee")
    public Employee update(Employee employee) {
        return service.saveOrUpdate(employee);
    }

    @DeleteMapping("/api/employee/{id}")
    public void delete(@PathVariable("id") Long id) { service.delete(id); }
}
