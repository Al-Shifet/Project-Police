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
public class Case {
    private int caseID;
    private String caseName;
    private String caseType;

    public Case(int caseID, String caseName, String caseType) {
        this.caseID = caseID;
        this.caseName = caseName;
        this.caseType = caseType;
    }

    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }
    
    
}
