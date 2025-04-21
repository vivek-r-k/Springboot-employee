package com.example.employee.service;

import com.example.employee.dao.EmployeeDAO;
import com.example.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    public int addEmployee(Employee emp) {
        return employeeDAO.addEmployee(emp);
    }

    public int updateEmployee(Employee emp) {
        return employeeDAO.updateEmployee(emp);
    }
}