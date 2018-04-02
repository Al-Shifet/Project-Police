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
public class PoliceOfficer {
    private int policeID;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String nationalID;
    private String rank;
    private String badgeNumber;
    private String password;

    public PoliceOfficer(int policeID, String firstName, String lastName, int phoneNumber, String nationalID, String rank, String badgeNumber, String password) {
        this.policeID = policeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.nationalID = nationalID;
        this.rank = rank;
        this.badgeNumber = badgeNumber;
        this.password = password;
    }

    public int getPoliceID() {
        return policeID;
    }

    public void setPoliceID(int policeID) {
        this.policeID = policeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
