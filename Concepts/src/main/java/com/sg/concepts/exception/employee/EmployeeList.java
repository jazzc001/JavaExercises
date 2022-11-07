/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.concepts.exception.employee;

/**
 *
 * @author jasminecheung
 */
public class EmployeeList {

    private Employee[] employees;
    private int totalNoOfEmployee;

    public EmployeeList(int totalNoOfEmployee) {
        super();
        this.totalNoOfEmployee = totalNoOfEmployee;
        employees = new Employee[totalNoOfEmployee];
    }

    public void inputEmployee(Employee employee, int index) throws NameException {

        boolean isExist = checkValue(employee, employees);
        if (isExist == false) {
            employees[index] = employee;
        } else {
            throw new NameException("Name already Exist");
        }

    }

    public void displayList() {
        for (Employee employee : employees) {
            System.out.println(
                    employee.getName() + " "
                    + employee.getAge());
        }
    }

    private boolean checkValue(Employee currentValue, Employee[] array) {
        for (Employee e : array) {
            if (e.getName().equals(currentValue.getName())) {
                return true;
            } else {
                
            }

        }
return false;
    }
}
