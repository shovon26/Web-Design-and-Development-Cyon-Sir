package com.one2many.spring.one2many.Service;

import com.one2many.spring.one2many.Model.Faculty;
import com.one2many.spring.one2many.Repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class FacultyServicesImplementation implements FacultyServices {

    @Autowired
    FacultyRepository facultyRepository;

    @Override
    public List<Faculty> getallfaculties() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty getFacultybyId(String id) {
        return facultyRepository.getOne(id);
    }

    @Override
    public void saveOrUpdateFaculty(Faculty faculty) {
     facultyRepository.save(faculty);
    }

    @Override
    public void deleteFacultybyId(String id) {
        facultyRepository.deleteById(id);
    }

}
