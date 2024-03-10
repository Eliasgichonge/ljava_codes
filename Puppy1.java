public class Puppy1 {
    int puppyAge;
    public void puppy(String name) {
        //Constructor has one parameter
        System.out.println("Name chosen is:" + name);
    }
    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy age is: " + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args) {
        // Object creation
        Puppy myPuppy = new Puppy();
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("Variable value:" + myPuppy.puppyAge);
    }
}
