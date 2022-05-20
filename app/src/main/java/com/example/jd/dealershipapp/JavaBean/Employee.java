package com.example.jd.dealershipapp.JavaBean;



public class Employee {

    private String name;
    private String jobTitle;
    private int imageID;
    private String[] employeeEmail;



    public Employee() {

    }

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int imageID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.imageID = imageID;
    }

    public Employee(String name, String jobTitle, int imageID, String[] employeeEmail) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.imageID = imageID;
        this.employeeEmail = employeeEmail;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String[] getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String[] employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}
