package com.shilpi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.shilpi.springmvc.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Employee> implements EmployeeDao {
 
    @Override
    public void deleteEmployeeBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
 
    @Override
    public Employee findById(int id) {
        return (Employee) getByKey(id);
    }
 
    @Override
    public void saveEmployee(Employee employee) {
         
        persist(employee);
    }
 
    @Override
    public List findAllEmployees() {
        Criteria criteria = createEntityCriteria();
        return (List) criteria.list();
    }
 
    @Override
    public Employee findEmployeeBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Employee) criteria.uniqueResult();
    }
}
