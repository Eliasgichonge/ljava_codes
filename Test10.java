public class Test10 {
    public static void main(String[] args) {
        Student [] students = { new Student(1, "Julie"),new Student(2, "Robert"), new Student(3, "Adam")};

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

