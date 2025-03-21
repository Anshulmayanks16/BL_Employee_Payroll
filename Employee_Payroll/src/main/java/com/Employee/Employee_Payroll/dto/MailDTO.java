package com.Employee.Employee_Payroll.dto;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MailDTO {
    String to;
    String subject;
    String body;


}
