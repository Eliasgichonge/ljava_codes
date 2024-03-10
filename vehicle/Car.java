package vehicle;
public class  Car extends Vehicle1 {
   
    public static void main(String[] args) {
        
        Vehicle1 a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
    
}