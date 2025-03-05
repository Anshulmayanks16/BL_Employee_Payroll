package com.Employee.Employee_Payroll.repositories;

import com.Employee.Employee_Payroll.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


}
