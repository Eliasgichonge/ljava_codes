public class Employee {

    public String name;
    public String Designation;
    private double salary;
    public int age;
    public Employee(String empName) {
        name = empName;
    }

    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void printEMp() {
        System.out.println("Name:"+name);
        System.out.println("Age:"+ age);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary:"+ salary);
        
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("Elias Mwita");
        empOne.setSalary(10000);
        empOne.printEMp();
    }

    public void empDesignation(String Designation) {
       this.Designation = Designation;
    }

    public void empAge(int age) {
      this.age = age;
    }
}
