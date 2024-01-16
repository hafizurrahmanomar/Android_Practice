package com.webappdeveloper.javaabstract;

public class FullTimeEmployee extends Employee{
    @Override
    public float calculateTax() {
        //5% tax add Employee salary
        return getSalary()*5/100;
    }

    @Override
    public float finalSalary() {
        return getSalary()-calculateTax();
    }

    public FullTimeEmployee(String emName, String emPosition,  float emSalary) {
        super(emName, emPosition,  emSalary);


    }
}
