import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };

        // Sort the array in ascending order
        Arrays.sort(arr);

        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
