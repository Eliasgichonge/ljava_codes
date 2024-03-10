public class Test18 {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == 40) {
                break;
            }
            System.out.println("Value of item: " + numbers[index]);
        }
    }
}
