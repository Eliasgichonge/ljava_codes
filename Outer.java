public class Outer {
    static class Nested_Demo {
        public void my_Method() {
            System.out.println("This is my nested class");
        }
    }

    public static void main(String[] args) {
        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        nested.my_Method();
    }
}
