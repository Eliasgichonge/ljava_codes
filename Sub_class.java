public class Sub_class extends Super_class {
    int num = 10;
    private String display;

    //display method of subclass
    public void display(){
        //Insantiating subclass
        Sub_class sub = new Sub_class();

        //Invoking the display() method of sub class
        sub.display();

        //Printing the value of variable nm of super class
        super.display();

        //printing tha value of variable num of sub class
        System.out.println("value of the variable named num in sub class:" +sub.display);

         //printing tha value of variable num of super class
         System.out.println("value of the variable named num in sub class:" +super.display);   
    }
    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
    private void my_method() {
       
    }
}
