public class Puppy {
    String name;
    public Puppy(String name){
        //    This constructor has onr parameter, name.
        System.out.println("Passed Name is :" +name);
    }
    public static void main(String[] args) {
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy("tommy");
    }
}
