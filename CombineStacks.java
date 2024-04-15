import java.util.Stack;

public class CombineStacks {
    public static void main(String[] args) {
        // Create two stacks and add five elements to each
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        for (int i = 1; i <= 5; i++) {
            stack1.push(i);
            stack2.push(i + 5);
        }
        
        // Combine two stacks into a single array
        int[] combinedArray = new int[stack1.size() + stack2.size()];
        int index = 0;
        
        while (!stack1.isEmpty()) {
            combinedArray[index++] = stack1.pop();
        }
        
        while (!stack2.isEmpty()) {
            combinedArray[index++] = stack2.pop();
        }
        
        // Print the combined array
        System.out.println("Combined Array: ");
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
    }
}
