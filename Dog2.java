public class Dog2 extends Mammal1 {
    
    public static void main(String[] args) {
        Mammal1 m = new Mammal1();
        Dog2 d = new Dog2();

        System.out.println(m instanceof Animal1);
        System.out.println(d instanceof Mammal1);
        System.out.println(d instanceof Animal1);
    }
}
