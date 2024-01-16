package com.webappdeveloper.javaabstract;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String emName, String emPosition, float emSalary) {
        super(emName, emPosition, emSalary);
    }

    @Override
    public float calculateTax() {
        return getSalary()*10/100;
    }

    @Override
    public float finalSalary() {
       return getSalary()-calculateTax();
    }
}
