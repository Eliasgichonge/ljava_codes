public class Puppy {
 String name;
public String puppyAge;
public String age;
    public void puppy(String name) {
        this.name = name;
        // This is a constructor with one parameter, name
        System.out.println("Passed Name is: " + name);
    }
    public static void main(String[] args) {
        // Following statement would create an object myPuppy
        @SuppressWarnings("unused")
        Puppy myPuppy = new Puppy();
    }
    public void setAge(int i) {
       
    }
    public void getAge() {
        
    }
}
