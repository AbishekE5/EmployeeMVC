package employeeconnect.employee.service;
import employeeconnect.employee.model.Address;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdressService {
    HashMap<String, Address> AddressByKey = new HashMap<String, Address>();
    /**
     * This method is used to create the employee details.
     * @param city This is the first parameter to create Employee
     * @param pincode  This is the second parameter to create Employee
     * @param permanentAddress  This is the third parameter to createEmployee
     * @param temporaryAddress This is the fourth parameter to createEmployee
     * @return city,pincode,permanentAddress,temporaryAddress
     */
    public Address addressAdd(String city, String pincode, String permanentAddress, String temporaryAddress){
        Address employee1 = new Address(city, pincode, permanentAddress, temporaryAddress);
        return AddressByKey.put(employee1.getCity(),employee1);
    }
    /**
     * This method is used to delete the employee details.
     * @param delete This is the first parameter to create Employee
     * @return delete
     */
    public String adressDelete(String delete) {

        if (AddressByKey.containsKey(delete)) {
            AddressByKey.remove(delete);
        }
        return delete;
    }
    /**
     * This method is used to retrive the employee details.
     * @param retrive
     * @return retrive
     */

    public boolean addressRetrive(String retrive) {
        if (AddressByKey.containsKey(retrive)) {
            Address recievedCity = AddressByKey.get(retrive);
            return true;
        } else {
            return false;
        }
    }
    /**
     * This method is used to check the employee details.
     * @param pincode
     * @return true,false
     */
    public boolean pincode(String pincode) {
        String number = "\\d{6}";

        //Creating a pattern object
        Pattern pattern = Pattern.compile(number);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(pincode);
        //Verifying whether given phone number is valid
        if (matcher.matches()) {
            return true;

        } else {
            return false;
        }
    }
    /**
     * This method is used to check the employee details.
     * @param city
     * @return true,false
     */

    public boolean city(String city) {
        String mail = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-zA-Z]$";
        Pattern pattern1 = Pattern.compile(mail);
        Matcher matcher1 = pattern1.matcher(city);
        if (matcher1.matches()) {
            return true;

        } else {
            return false;

        }
    }
}
