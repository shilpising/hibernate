package com.shilpi.springmvc.dao;

import java.util.List;

import com.shilpi.springmvc.model.Employee;

public interface EmployeeDao {

	Employee findById(int id);
    
    void saveEmployee(Employee employee);
      
    void deleteEmployeeBySsn(String ssn);
      
    List findAllEmployees();
  
    Employee findEmployeeBySsn(String ssn);
}
