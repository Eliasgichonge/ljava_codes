public class Deer extends Animal2 implements Vegetarian {
    
    public static void main(String[] args) {
        Deer d = new Deer();
        Animal2 a = d;
        Vegetarian v = d;
        Object o = d;

        System.out.println(d instanceof Deer);
        System.out.println(a instanceof Deer);
        System.out.println(v instanceof Deer);
        System.out.println(o instanceof Deer);
    }
}
