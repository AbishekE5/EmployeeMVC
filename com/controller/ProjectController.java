package com.controller;

import com.model.Project;
import com.service.ProjectService;

public class ProjectController {
    /**
     * This method is used to send the user input to create employee details.
     * @param projectId This is the first parameter to create Employee
     * @param projectName  This is the second parameter to create Employee
     * @param timeEstimation  This is the third parameter to createEmployee
     * @param budget This is the fourth parameter to createEmployee
     * @param description  This is the fifth parameter to createEmployee
     * @return projectId,projectName,timeEstimation,bugdet,description
     */
    ProjectService service = new ProjectService();
    public Project createProject(String projectId, String projectName, String timeEstimation, String bugdet,String description) {
        return service.createProject(projectId,projectName,timeEstimation,bugdet,description);

    }
    /**
     * This method is used to send the user input to retrive employee details.
     * @param retrive This is the  parameter to delete Employee
     * @return retrive
     */

    public Project retrieveEmployee(String retrive){
        return service.retrieveEmployee(retrive);
    }
    /**
     * This method is used to send the user input to delete employee details.
     * @param delete This is the  parameter to delete Employee
     * @return delete
     */

    public String deleteProject(String delete){
        return service.deleteProject(delete);

    }
    /**
     * This method is used to send check retrive employee details.
     * @param retrive This is the  parameter to delete Employee
     * @return retrive
     */

    public boolean isretriveEmployee(String retrive){
        return service.isretriveEmployee(retrive);

    }


}
