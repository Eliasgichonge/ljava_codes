public class This_Example {
    // Insatnce variable num
    int num = 10;

    This_Example() {
        System.out.println("This is example program on keyword this");
    }

    This_Example(int num) {
        // Invoking the default constructor
        this();

        // Assigning the local variable <i>num<i> to the insatnce variable 
        this.num = num;
    } 
    public void greet() {
        System.out.println("Hi Welcome to Tutorialspoint");
    }

    public void print() {

        // local variable num
        int num = 20;

        // printing the local variable 
        System.out.println("Variable of local variable num is :" + num);

        // printing the instance variable
        System.out.println("Value of instance variable num is: " + this.num);

        // Invoking the greet mathod of a class
        this.greet();
    }
    public static void main(String[] args) {
        // Instiatiating the class
        This_Example obj1 = new This_Example();

        // Invoking the print method
        obj1.print();

        // passing a new value to the num variable through paramentrized const
        This_Example obj2 = new This_Example(30);

        // Invoking the print method again
        obj2.print();
    }
}
