public class EmployeeTest {
    public static void main(String[] args) {
        // Create two objects using constructor
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // invoking methods for each objects created
        empOne.empAge(26);
        empOne.empDesignation("Senior software Engineer");
        empOne.empSalary(1000);
        empOne.PrintEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.PrintEmployee();
    }
}
