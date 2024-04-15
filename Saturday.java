import java.util.Scanner;

public class Saturday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How Old are you? ");
        String age = scanner.nextLine();

        System.out.print("What is your favourite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + "Old");
        System.out.println("You like " + food);
    }
}
