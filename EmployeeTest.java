public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee(" James Smith");
        Employee empTwo = new Employee(" Mary Anne");
        empOne.empAge(26);
        empOne.empDesignation(" Senior Software Engineer");
        empOne.setSalary(1000);
        empOne.printEMp();

        empTwo.empAge(21);
        empTwo.empDesignation(" Software Engineer");
        empTwo.setSalary(500);
        empTwo.printEMp();
    }
}
