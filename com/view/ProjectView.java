package com.view;

import com.controller.ProjectController;

import java.util.Scanner;

public class ProjectView {
    ProjectController controller = new ProjectController();
    /**
     * This method is used to prompt user to enter menu options.
     */

    public static int menu() {
        System.out.println("Choose one option from following : ");
        System.out.println("1) Add a new Project.");
        System.out.println("2) Delete an project via Project-ID.");
        System.out.println("3) Retrive an project via Project-ID.");
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
                    this.addProject();

                    break;
                /* Case to delete the employee details with user input */
                case 2:
                    this.deleteProject();

                    break;

                /* case to retrive data using employee-id */
                case 3:
                    this.retrieveProject();
                    break;

                case 4:
                    return;
            }
            menuStore = menu();
        }


    }
    /**
     * This method is used to add a new project
     */

    public void addProject(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a Projectid: ");
        String projectId = scanner1.nextLine();

        System.out.println("Enter Project Name: ");
        String projectName = scanner1.nextLine();
        System.out.println("Enter Project time estimation ");
        String timeEstimation = scanner1.nextLine();

        System.out.println("Enter Budget");
        String bugdet = scanner1.nextLine();

        System.out.println("Enter Description");
        String description = scanner1.nextLine();

        controller.createProject(projectId,projectName,timeEstimation,bugdet,description);

        System.out.println("Employee Successfully created");
    }
    /**
     * This method is used to delete a new employee
     */

    public void deleteProject(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the Project-ID of the employee you wish to delete: ");
        String delete = scanner2.nextLine();
        controller.deleteProject(delete);
        System.out.println("Project Successfully deleted");
    }
    /**
     * This method is used to retrive a new employee
     */

    public void retrieveProject() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter the Emp-id of the employee you wish to retrive: ");
        String retrive = scanner3.nextLine();
        if (controller.isretriveEmployee(retrive)){
            System.out.println(controller.retrieveEmployee(retrive));

        }else {
            System.out.println("ProjectID does not exist");
        }

    }

}


