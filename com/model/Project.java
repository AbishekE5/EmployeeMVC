package com.model;

public class Project {
    private String projectId;
    private String projectName;
    private String timeEstimation;
    private String budget;
    private String description;


    public Project(String projectId, String projectName, String timeEstimation, String budget, String description) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.timeEstimation = timeEstimation;
        this.budget = budget;
        this.description = description;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTimeEstimation() {
        return timeEstimation;
    }

    public void setTimeEstimation(String timeEstimation) {
        this.timeEstimation = timeEstimation;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
