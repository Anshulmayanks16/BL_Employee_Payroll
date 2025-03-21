package com.Employee.Employee_Payroll.interfaces;




import com.Employee.Employee_Payroll.dto.AuthUserDTO;
import com.Employee.Employee_Payroll.dto.LoginDTO;
import com.Employee.Employee_Payroll.dto.PassDTO;
import org.springframework.stereotype.Service;

@Service
public interface IAuthInterface {

    public String register(AuthUserDTO user) throws Exception;


    public String login(LoginDTO user);

    public AuthUserDTO forgotPassword(PassDTO pass, String email) throws Exception;

    public String resetPassword(String email, String currentPass, String newPass) throws Exception;
}
