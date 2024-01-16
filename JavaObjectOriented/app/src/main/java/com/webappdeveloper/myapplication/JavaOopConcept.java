package com.webappdeveloper.myapplication;

public class JavaOopConcept {
    private  String name;
    private  String ClassName;
    private  int RolNumber;

    public  JavaOopConcept(String studentName, String studentClass, int studentRoll) {
        this.name = studentName;
        this.ClassName = studentClass;
        this.RolNumber =studentRoll;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getRolNumber() {
        return RolNumber;
    }

    public void setRolNumber(int rolNumber) {
        RolNumber = rolNumber;
    }
}
