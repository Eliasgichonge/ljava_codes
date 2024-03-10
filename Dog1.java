public class Dog1 extends Mammal{
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog1 d = new Dog1();

        System.out.println(a instanceof Animal);
        System.out.println(m instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}
