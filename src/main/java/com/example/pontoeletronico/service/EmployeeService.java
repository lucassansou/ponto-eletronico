package com.example.pontoeletronico.service;

import com.example.pontoeletronico.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveOrUpdate(Employee entity);

    void delete(Long id);

    List<Employee> getAll();

    Employee getById(Long id);

}
