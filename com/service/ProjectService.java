package com.service;

import com.model.Project;

import java.util.HashMap;

public class ProjectService {

    HashMap<String, Project> projectByKey = new HashMap<String, Project>();
    /**
     * This method is used to create the employee details.
     * @param projectId This is the first parameter to create Employee
     * @param projectName  This is the second parameter to create Employee
     * @param timeEstimation This is the third parameter to createEmployee
     * @param budget This is the fourth parameter to createEmployee
     * @param description  This is the fifth parameter to createEmployee
     * @return prjectByKey
     */

    public Project createProject(String projectId, String projectName, String timeEstimation, String budget, String description) {
        Project employee = new Project(projectId,projectName, timeEstimation, budget, description);
        return projectByKey.put(employee.getProjectId(), employee);

    }
    /**
     * This method is used to delete the employee details.
     * @param delete
     * @return delete
     */

    public String deleteProject(String delete){
        if (projectByKey.containsKey(delete)) {
            projectByKey.remove(delete);
        }
        return delete;
    }
    /**
     * This method is used to retrive the employee details.
     * @param retrive
     * @return true,false
     */

    public boolean isretriveEmployee(String retrive){
        if (projectByKey.containsKey(retrive)) {

            return true;
        } else {
            return false;
        }
    }
    /**
     * This method is used to retrive the employee details.
     * @param retrive
     * @return recievedProject
     */

    public Project retrieveEmployee(String retrive){
        Project recievedProject = projectByKey.get(retrive);
        return recievedProject;

    }
}
