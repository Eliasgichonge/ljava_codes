public class This_Example {
    // instance variable num
    int num = 10;

    This_Example(){
        System.out.println("This is an example program on key word this");
    }

    This_Example(int num){
        // Invoking the default constructor
        this();
        // Assigning the local variable <i>num<i> to the instance variable
        this.num = num;
    }

    public void greet(){
        System.out.println("Hi, welcome to TutorialsPoint");
    }

    public void print(){
        // local variable num
        int num = 20;

        // Printing the instance variable
        System.out.println("value of local variable num is "+num);

        // printing the instance variable
        System.out.println("value of instance variable num is "+this.num);

        // Invoking the greet method of a class
        this.greet();
    }
    public static void main(String[] args) {
        // instantiating the class
        This_Example obj1 = new This_Example();

        // Invoking the print method
        obj1.print();

        // passing a new value to the num variable through parametrized constant
        This_Example obj2 = new This_Example(30);
        
        // invoking the print method again
        obj2.print();
    }
}
