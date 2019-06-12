package com.one2many.spring.one2many.Service;

import com.one2many.spring.one2many.Model.Faculty;

import java.util.List;

public interface FacultyServices {

    List<Faculty> getallfaculties();

    Faculty getFacultybyId(String id);

    void saveOrUpdateFaculty(Faculty faculty);

    void deleteFacultybyId(String id);


}
