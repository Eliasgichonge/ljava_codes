public class Test21 {
    public static void main(String[] args) {
        int x = 10;

        do {
            x++;
            if(x == 15) {
                continue;
            }
            System.out.println("value of x:" + x);
        } while (x < 20);
    }
}
