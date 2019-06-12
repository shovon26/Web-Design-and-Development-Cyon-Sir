package com.one2many.spring.one2many.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Faculty")
public class Faculty {

    @Id
    private String facultyId;

    private  String facultyName;

    private String facultyCode;

    @OneToMany(fetch = FetchType.LAZY , orphanRemoval = true ,
            mappedBy = "faculty" , cascade = CascadeType.ALL)
    private Set<Department> departments = new HashSet<Department>();


    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }
}
