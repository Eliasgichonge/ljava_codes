public class Test19 {
    public static void main(String[] args) {
        int x = 10;
        while (x < 20) {
            x++;
            if (x == 15) {
                continue;
            }
            System.out.println("Value of x:" + x);
        }
    }
}
