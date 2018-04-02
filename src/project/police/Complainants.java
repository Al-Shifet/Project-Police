/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.police;

/**
 *
 * @author Isaack
 */
public class Complainants {
    private int id;
    private int caseID;
    private String firstName;
    private String LastName;
    private int phoneNumber;
    private int nationalID;

    public Complainants(int id, int caseID, String firstName, String LastName, int phoneNumber, int nationalID) {
        this.id = id;
        this.caseID = caseID;
        this.firstName = firstName;
        this.LastName = LastName;
        this.phoneNumber = phoneNumber;
        this.nationalID = nationalID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }
    
    
    
}
