package org.example.app.repository.ext;

import org.example.app.entity.Employee;
import org.example.app.repository.BaseRepository;

import java.util.List;

public interface EmployeesRepository extends BaseRepository<Employee> {
    void save(Employee employee);
    List<Employee> fetchAll();
    Employee fetchById(Long id);
    void delete(Long id);
}
