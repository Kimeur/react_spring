package com.restfirstapp.ms.Repositories;

import com.restfirstapp.ms.Models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

};
