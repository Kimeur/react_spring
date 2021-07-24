package com.restfirstapp.ms.Controllers;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Api
public class EmployeeController {


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/employee")
    public String employee() {
        return "employee";
    }

}
