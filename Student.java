
public class Student {
    private String string;
    private int i;
    public Student(int i, String string) {
        this.i = i;
        this.string = string;
    }

       @Override
    public String toString() {
        return "[" + this.i + ", " + this.string + "]";
    }
}
