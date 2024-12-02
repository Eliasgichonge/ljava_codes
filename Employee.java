public class Employee {
    // This instance variable is visible for any child class.
    public static String name;
    static int age;
    static String designation;
    static double salary;

    // this is the constructor of the class Employee
    public Employee(String name) {
        Employee.name = name;
    }

    // assign the age of the Employee to the variable age.
    public void empAge(int empAge) {
        age = empAge;
    }

    // assign the designation to the variable designation.
    public void empDesignation(String empDesignation) {
        designation = empDesignation;
    }

    // Assign the salary to the variable salary.
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    // Print the Employee details.
    public void PrintEmployee() {
        System.out.println("Name" + name);
        System.out.println("age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("salary:" + salary);
    }

    // salary variable is visible in Employee class only.
    // private double salary;

    // The name variable is assigned in the constructor.
    // public Employee(String empName){
    // name = empName;
    // }

    // The salary variable is assigned a value.
    // public void setSalary(double empSalary){
    // salary = empSalary;
    // }

    // This method prints the employee details.
    // public void printEmp(){
    // System.out.println("name : " + name);
    // System.out.println("Salary : " + salary);
    // }

    // public static void main(String[] args) {
    // Employee empOne = new Employee("Elias Mwita");
    // empOne.setSalary(1000);
    // empOne.printEmp();
    // }
}
