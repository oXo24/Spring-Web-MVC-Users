package org.example.app.service.impl;

import jakarta.transaction.Transactional;
import org.example.app.entity.Employee;
import org.example.app.repository.ext.EmployeesRepository;
import org.example.app.service.ext.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service використовується для анотування
// класів реалізації сервісів.
// @Transactional застосовується до сервісного шару
// для підтримки транзакцій.
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeesRepository repository;

    @Override
    @Transactional
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    @Transactional
    public List<Employee> fetchAll() {
        return repository.fetchAll();
    }

    @Override
    @Transactional
    public Employee fetchById(Long id) {
        return repository.fetchById(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.delete(id);
    }
}
