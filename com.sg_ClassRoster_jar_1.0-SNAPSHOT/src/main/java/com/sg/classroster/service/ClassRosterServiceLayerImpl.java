/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.classroster.service;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterPersistenceException;
import com.sg.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author jasminecheung
 */
public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer {

    @Override
    public void createStudent(Student student) throws ClassRosterDuplicateIdException, ClassRosterDataValidationException, ClassRosterPersistenceException {
        // First check to see if there is alreay a student 
    // associated with the given student's id
    // If so, we're all done here - 
    // throw a ClassRosterDuplicateIdException
    if (dao.getStudent(student.getStudentId()) != null) {
        throw new ClassRosterDuplicateIdException(
                "ERROR: Could not create student.  Student Id "
                + student.getStudentId()
                + " already exists");
    }

    // Now validate all the fields on the given Student object.  
    // This method will throw an
    // exception if any of the validation rules are violated.
    validateStudentData(student);

    // We passed all our business rules checks so go ahead 
    // and persist the Student object
    dao.addStudent(student.getStudentId(), student);
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        //this is a pass-through method: we simply turn around and call the getAllStudents method on the DAO and return the results
        return dao.getAllStudents();
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        return dao.getStudent(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        return dao.removeStudent(studentId);
    }
    
    ClassRosterDao dao;
    
    public ClassRosterServiceLayerImpl(ClassRosterDao dao) {
        this.dao = dao;
    }
    
    private void validateStudentData(Student student) throws ClassRosterDataValidationException {
        if (student.getFirstName() == null
            || student.getFirstName().trim().length() == 0
            || student.getLastName() == null
            || student.getLastName().trim().length() == 0
            || student.getCohort() == null
            || student.getCohort().trim().length() == 0) {

        throw new ClassRosterDataValidationException(
                "ERROR: All fields [First Name, Last Name, Cohort] are required.");
    }
    }

}
