package src.com.jasmine.employee.persistance;

import src.com.jasmine.employee.entity.Employee;

import java.util.Collection;

public interface EmployeeDao {

    Collection<Employee> getAllRecords();
}
