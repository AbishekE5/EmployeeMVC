package employeeconnect.employee.view;
import employeeconnect.employee.controller.EmployeeController;
import java.util.Scanner;

public class EmployeeView {
    EmployeeController controller = new EmployeeController();

    /**
     * This method is used to prompt user to enter menu options.
     */
    public static int menu() {
        System.out.println("Choose one option from following : ");
        System.out.println("1) Add a new employee.");
        System.out.println("2) Delete an employee via Emp-ID.");
        System.out.println("3) Retrive an employee via Emp-ID.");
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
                    this.addEmployee();

                    break;
                /* Case to delete the employee details with user input */
                case 2:
                    this.deleteEmployee();

                    break;

                /* case to retrive data using employee-id */
                case 3:
                    this.retrieveEmployee();
                    break;

                case 4:
                    return;
            }
            menuStore = menu();
        }


    }
    /**
     * This method is used to add a new employee
     */
    public void addEmployee(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a employeeid: ");
        String employeeid = scanner1.nextLine();
        String phoneNumber;
        boolean number = true;
        do {
            System.out.println("Enter Phone Number: ");
            phoneNumber = scanner1.nextLine();
            if (controller.phoneNumber(phoneNumber)){
                System.out.println("Entered Number is Valid");
                break;
            } else{
            System.out.println("Entered Number is Invalid... Enter valid Number");
        }
        }while(number);

        String emailID;
        boolean mail = true;
          do {
              System.out.println("Enter emailID: ");
              emailID = scanner1.nextLine();
              if (controller.emailID(emailID)) {
                  System.out.println("Entered emailID is valid");
                  break;
              } else {
                  System.out.println(" Entered EmailID is Invalid... Enter valid EmailID");
              }
          }while (mail);

          System.out.println("Enter First Name: ");
          String firstName = scanner1.nextLine();

          System.out.println("Enter Last Name: ");
          String lastName = scanner1.nextLine();
          controller.createEmployee(employeeid,phoneNumber,emailID,firstName,lastName);

        System.out.println("Employee Successfully created");
    }
    /**
     * This method is used to perform the delete operations
     */

    public void deleteEmployee(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the Emp-ID of the employee you wish to delete: ");
        String delete = scanner2.nextLine();
        controller.deleteEmployee(delete);
        System.out.println("Employee Successfully deleted");
    }
    /**
     * This method is used to perform the retrive operations
     */
    public void retrieveEmployee() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter the Emp-id of the employee you wish to retrive: ");
        String retrive = scanner3.nextLine();
        if (controller.isretriveEmployee(retrive)){
            System.out.println(controller.employeeRetrive(retrive));
        }else {
            System.out.println("EmployeeID does not exist");
        }

    }
}





