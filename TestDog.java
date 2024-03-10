public class TestDog {
    public static void main(String[] args) {
        Animal3 a = new Animal3();// Animal reference and object
        Animal3 b = new Dog3();// Animal reference but Dog

        a.move();  // runs the method in Animal3 class
        b.move();  // runs the method in Dog3 class
        ((Dog3) b).bark();
    }
}
