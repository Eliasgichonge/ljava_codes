import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
    
    public static void main(String[] args) {
        List<String> a1 = new LinkedList<>();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println("ArrayList Elements");
        System.out.print("\t" + a1);

        // Remove second element
        a1.remove(1);

        System.out.println("\nArrayList Elements");
        System.out.print("\t" + a1);
    }
}
