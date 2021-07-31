package com.restfirstapp.ms.Controllers;

import com.restfirstapp.ms.Models.Employee;
import com.restfirstapp.ms.Repositories.EmployeeRepo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeRepo EmpRepo;


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/employees")
    public Iterable<Employee> employee() {
        return this.EmpRepo.findAll();
    }

}
