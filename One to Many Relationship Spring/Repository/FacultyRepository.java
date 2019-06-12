package com.one2many.spring.one2many.Repository;

import com.one2many.spring.one2many.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty,String> {


}
