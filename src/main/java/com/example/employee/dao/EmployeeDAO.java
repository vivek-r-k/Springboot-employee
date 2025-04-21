package com.example.employee.dao;

import com.example.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmployees() {
        return jdbcTemplate.query("SELECT * FROM employee", new BeanPropertyRowMapper<>(Employee.class));
    }

    public Employee getEmployeeById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Employee.class));
    }

    public int addEmployee(Employee emp) {
        return jdbcTemplate.update("INSERT INTO employee (name, department, salary) VALUES (?, ?, ?)",
                emp.getName(), emp.getDepartment(), emp.getSalary());
    }

    public int updateEmployee(Employee emp) {
        return jdbcTemplate.update("UPDATE employee SET name = ?, department = ?, salary = ? WHERE id = ?",
                emp.getName(), emp.getDepartment(), emp.getSalary(), emp.getId());
    }
}