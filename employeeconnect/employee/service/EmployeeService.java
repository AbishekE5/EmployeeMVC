package employeeconnect.employee.service;
import employeeconnect.employee.model.Employee;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmployeeService {

    HashMap<String, Employee> employeesByKey = new HashMap<String, Employee>();
    /**
     * This method is used to create the employee details.
     * @param employeeid This is the first parameter to create Employee
     * @param phoneNumber  This is the second parameter to create Employee
     * @param emailID  This is the third parameter to createEmployee
     * @param firstName This is the fourth parameter to createEmployee
     * @param lastName  This is the fifth parameter to createEmployee
     * @return employeeid,phoneNumber,emailID,firstName,lastName
     */

    public Employee employeeStore(String employeeid, String phoneNumber, String emailID, String firstName, String lastName) {
        Employee employee = new Employee(employeeid, phoneNumber, emailID, firstName, lastName);
        return employeesByKey.put(employee.getEmployeeid(), employee);
    }
    /**
     * This method is used to delete the employee details.
     * @param delete
     * @return delete
     */
    public String employeeDelete(String delete) {

        if (employeesByKey.containsKey(delete)) {
            employeesByKey.remove(delete);
        }
        return delete;
    }
    /**
     * This method is used to retrive the employee details.
     * @param retrive
     * @return recievedEmployee
     */
    public Employee employeeRetrive(String retrive){
        Employee recievedEmployee = employeesByKey.get(retrive);
        return recievedEmployee;
    }
    /**
     * This method is used to delete the employee details.
     * @param retrive
     * @return true,false
     */

    public boolean isemployeeRetrive(String retrive) {
        if (employeesByKey.containsKey(retrive)) {
            Employee recievedEmployee = employeesByKey.get(retrive);

            return true;
        } else {
            return false;
        }
    }
    /**
     * This method is used to validate phone number
     * @param phoneNumber
     * @return true,false
     */
    public boolean phoneNumber(String phoneNumber) {
        String number = "\\d{10}";

        //Creating a pattern object
        Pattern pattern = Pattern.compile(number);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(phoneNumber);
        //Verifying whether given phone number is valid
        if (matcher.matches()) {
            return true;

        } else {
            return false;

        }
    }
    /**
     * This method is used to validate email-ID
     * @param emailID
     * @return true,false
     */

    public boolean emailId(String emailID) {
        String mail = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-zA-Z]$";
        Pattern pattern1 = Pattern.compile(mail);
        Matcher matcher1 = pattern1.matcher(emailID);
        if (matcher1.matches()) {
            return true;

        } else {
            return false;

        }
    }
}


