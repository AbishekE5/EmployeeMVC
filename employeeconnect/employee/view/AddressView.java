package employeeconnect.employee.view;

import employeeconnect.employee.controller.AddressController;

import java.util.Scanner;

public class AddressView {
    AddressController controller1 = new AddressController();
    /**
     * This method is used to prompt user to enter menu options.
     */

    public static int menu() {
        System.out.println("Choose one option from following : ");
        System.out.println("1) Add a new city.");
        System.out.println("2) Delete an city via pincode.");
        System.out.println("3) Retrive an city via pincode.");
        System.out.println("4) Exit.");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    /**
     * This method is used to perform the CRUD operations
     */

    public void performCrud() {

        int menuStore = menu();
        while (menuStore != 5) {
            System.out.println();

            switch (menuStore) {

                /* switch statement to create employee details */
                case 1:
                    this.addCity();

                    break;
                /* Case to delete the employee details with user input */
                case 2:
                    this.deleteCity();

                    break;

                /* case to retrive data using employee-id */
                case 3:
                    this.retrieveCity();
                    break;

                case 4:
                    return;
            }
            menuStore = menu();
        }


    }
    /**
     * This method is used to add a new city
     */

    public void addCity() {
        Scanner scanner1 = new Scanner(System.in);
        String city;
        boolean number = true;
        do {
            System.out.println("Enter your pincode ");
            city = scanner1.nextLine();
            if (controller1.city(city)) {
                System.out.println("Entered pincode is Valid");
                break;
            } else {
                System.out.println("Entered City is Invalid... Enter valid City");
            }
        } while (number);

        System.out.println("Enter city: ");

        String pincode;
        boolean code = true;
        do {
            System.out.println("Enter your city ");
            pincode = scanner1.nextLine();
            if (controller1.pincode(pincode)) {
                System.out.println("Entered city is Valid");
                break;
            } else {
                System.out.println("Entered city is Invalid... Enter valid city");
            } }while (code) ;

            System.out.println("Enter Temporary Address ");
            String temporaryAddress = scanner1.nextLine();

            System.out.println("Enter Permanent Address: ");
            String permanentAddress = scanner1.nextLine();

            System.out.println("City Successfully created");
            controller1.createEmployee(city, pincode, permanentAddress, temporaryAddress);

    }
    /**
     * This method is used to delete a city
     */

           public void deleteCity () {
           Scanner input2 = new Scanner(System.in);
           System.out.println("Please enter the Emp-ID of the employee you wish to delete: ");
           String delete = input2.nextLine();
           controller1.deleteEmployee(delete);
           System.out.println("Employee Successfully deleted");
        }

        /**
        * This method is used to retrive a city
        */

            public void retrieveCity () {
            Scanner input3 = new Scanner(System.in);
            System.out.println("Please enter the Emp-id of the employee you wish to retrive: ");
            String retrive = input3.nextLine();
            controller1.retriveEmployee(retrive);
        }
    }

