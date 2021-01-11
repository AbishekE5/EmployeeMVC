package employeeconnect.employee.controller;

import employeeconnect.employee.model.Address;
import employeeconnect.employee.service.AdressService;

public class AddressController {
    AdressService service1 = new AdressService();
    /**
     * This method is used to send the user input to create employee details.
     * @param city This is the first parameter to create Employee
     * @param pincode This is the second parameter to create Employee
     * @param permanentAddress This is the third parameter to createEmployee
     * @param temporaryAddress This is the fourth parameter to createEmployee
     * @return city, pincode, permanentAddress, temporaryAddress
     */

    public Address createEmployee(String city, String pincode, String permanentAddress, String temporaryAddress) {

        return service1.addressAdd(city, pincode, permanentAddress, temporaryAddress);

    }
    /**
     * This method is used to send the user input to create employee details.
     * @param delete
     * @return delete
     */

    public String deleteEmployee(String delete) {

        return service1.adressDelete(delete);
    }
    /**
     * This method is used to retrive employee details.
     * @param retrive
     * @return retrive
     */

    public boolean retriveEmployee(String retrive) {
        return service1.addressRetrive(retrive);

    }
    /**
     * This method is used to validate employee details.
     * @param pincode
     * @return retrive
     */

    public boolean pincode(String pincode) {
        return service1.pincode(pincode);
    }

    /**
     * This method is used to validate city details.
     * @param city
     * @return city
     */

    public boolean city(String city) {
        return service1.city(city);
    }
}