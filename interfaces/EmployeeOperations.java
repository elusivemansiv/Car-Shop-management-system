package interfaces;

import java.lang.*;
import classes.*;


public interface EmployeeOperations
{
	void insertEmployee(Internship e);
    void removeEmployee(Internship e);
    Internship getEmployee(String empId);
    void showAllEmployees( );
}