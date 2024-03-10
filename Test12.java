public class Test12 {
    public static void main(String[] args) {
        Student[] students = { new Student(1, "Julie"), new Student(2, "Adam")};
        for (Student student : students) {
            System.out.print(student);
            System.out.print(", ");
        }
    }
}
