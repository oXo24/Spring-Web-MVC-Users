package org.example.app.service.ext;

import org.example.app.entity.Employee;
import org.example.app.service.BaseService;

import java.util.List;

public interface EmployeeService extends BaseService<Employee> {
    void save(Employee employee);
    List<Employee> fetchAll();
    Employee fetchById(Long id);
    void delete(Long id);
}
