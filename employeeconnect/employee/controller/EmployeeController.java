package employeeconnect.employee.controller;

import employeeconnect.employee.model.Employee;
import employeeconnect.employee.service.EmployeeService;

import java.util.HashMap;


public class EmployeeController {
    EmployeeService service = new EmployeeService();
    /**
     * This method is used to send the user input to create employee details.
     * @param employeeid This is the first parameter to create Employee
     * @param phoneNumber  This is the second parameter to create Employee
     * @param emailID  This is the third parameter to createEmployee
     * @param firstName This is the fourth parameter to createEmployee
     * @param lastName  This is the fifth parameter to createEmployee
     * @return employeeid,phoneNumber,emailID,firstName,lastName
     */
    public Employee createEmployee(String employeeid, String phoneNumber, String emailID, String firstName, String lastName) {

       return service.employeeStore(employeeid,phoneNumber,emailID,firstName,lastName);

    }

    /**
     * This method is used to send the user input to delete employee details.
     * @param delete This is the  parameter to delete Employee
     * @return delete
     */
    public String deleteEmployee(String delete){

        return service.employeeDelete(delete);
    }

    /**
     * This method is used retrive employee details.
     * @param retrive
     * @return retrive
     */

    public boolean isretriveEmployee(String retrive){
        return service.isemployeeRetrive(retrive);

    }
    /**
     * This method is used to validate phone number entered by user.
     * @param phoneNumber
     * @return phoneNumber
     */
    public boolean phoneNumber(String phoneNumber){
        return service.phoneNumber(phoneNumber);
    }
    /**
     * This method is used to validate email-ID entered by user.
     * @param emailID
     * @return emailID
     */
    public boolean emailID(String emailID){
        return service.emailId(emailID);
    }
    /**
     * This method is used to validate email-ID entered by user.
     * @param retrive
     * @return emailID
     */

    public Employee employeeRetrive(String retrive){
        return service.employeeRetrive(retrive);
    }

}
