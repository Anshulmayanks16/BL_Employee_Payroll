package com.Employee.Employee_Payroll.repositories;




import com.Employee.Employee_Payroll.entities.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<AuthUser, Long> {

    public AuthUser findByEmail(String email);

}
