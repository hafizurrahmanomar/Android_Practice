package com.webappdeveloper.javaabstract;

public abstract class Employee {
   private final String Name;
    private final String Position;
   private final Float Salary;
   public abstract float calculateTax();
   public abstract float finalSalary();

    //constructor create
    public Employee(String emName,String emPosition,float emSalary){

        this.Name = emName;
        this.Position =emPosition;
        this.Salary= emSalary;

    }

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public Float getSalary() {
        return Salary;
    }
}

