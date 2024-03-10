public class Puppy2 {
    private int age;
    String name;

    public void Puppy(){
        
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();

        // update age variable using using method call

        myPuppy.setAge(2);

        //update name directly
        myPuppy.name = "Tommy";
        System.out.println("Age: " + myPuppy.age +", name: " + myPuppy.name);
    }
}
