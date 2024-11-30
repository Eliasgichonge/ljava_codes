public class Puppy {
    String name;
    int puppyAge;
    public Puppy(String name){
        //    This constructor has onr parameter, name.
        System.out.println("Passed Name is :" +name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("Puppy's age is:" +puppyAge);
        return puppyAge;
    }
    public static void main(String[] args) {
        // Following statement would create an object myPuppy
        // Object creation
        Puppy myPuppy = new Puppy("tommy");
        // Call class method to set puppy's age
        myPuppy.setAge(2);
        // Call another class method to get puppy's age
        myPuppy.getAge();
        // You can access instance variable as follows as well
        System.out.println("Variable value:" +myPuppy.puppyAge);

    }
}
