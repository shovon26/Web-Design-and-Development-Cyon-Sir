package com.one2many.spring.one2many.Controller;

import com.one2many.spring.one2many.Model.Faculty;
import com.one2many.spring.one2many.Repository.FacultyRepository;
import com.one2many.spring.one2many.Service.FacultyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.Null;
import java.util.List;

@Controller
public class FacultyController {

    @Autowired
    FacultyServices facultyServices;

   @GetMapping (value = "/allFaculties")
    public ModelAndView showallfaculties() {

       ModelAndView modelAndView= new ModelAndView("Faculties");

       List<Faculty> facultyList =facultyServices.getallfaculties();
       modelAndView.addObject("Faculties",facultyList);
        return modelAndView;
    }


    @GetMapping(value = "/addfaculty")
    public ModelAndView addnewFaculty()
    {
        ModelAndView modelAndView=new ModelAndView("FacultyForm");

        Faculty faculty =new Faculty();
        modelAndView.addObject("faculty", faculty);

        return modelAndView;
    }

    @PostMapping(value = "/saveFaculty")
    public ModelAndView saveFaculty(@ModelAttribute("faculty") Faculty faculty)
    {
        facultyServices.saveOrUpdateFaculty(faculty);
        return new ModelAndView("redirect:/allFaculties");
    }

    @GetMapping(value = "/edit/{id}")
    public ModelAndView editFaculty(@PathVariable("id") String FacultyId)
    {
        Faculty faculty =facultyServices.getFacultybyId(FacultyId);
        ModelAndView modelAndView = new ModelAndView("FacultyForm");
        modelAndView.addObject("faculty" , faculty);
        return modelAndView;
    }

    @GetMapping(value = "/delete/{id}")
    public ModelAndView deleteFaculty(@PathVariable("id") String FacultyId){

       facultyServices.deleteFacultybyId(FacultyId);

        return new ModelAndView("redirect:/allFaculties");
    }
}
