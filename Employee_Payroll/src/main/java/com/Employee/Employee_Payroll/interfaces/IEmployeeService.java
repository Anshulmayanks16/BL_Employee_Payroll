package com.Employee.Employee_Payroll.interfaces;



import com.Employee.Employee_Payroll.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {

    public EmployeeDTO get(Long id) throws Exception;

    public EmployeeDTO create(EmployeeDTO newEmp) throws Exception;

    public EmployeeDTO edit(EmployeeDTO emp, Long id) throws Exception;

    public String delete(Long id);


}
