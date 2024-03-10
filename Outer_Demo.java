public class Outer_Demo {
    int num = 175;

    //inner class
    class Inner_Demo {
       public void print() {
        System.out.println("This is an inner class");
       } 
       
       public int getNum() {
        System.out.println("This is the getNum method of the inner class");
        return num;
       }
    }

    // Accessing the inner class from the method within
     public void display_Inner() {
         Inner_Demo inner = new Inner_Demo();
         inner.print();
     }
}
