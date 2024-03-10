public class VarargsDemo {
    // call method with variable args
    //void printMax(34, 3, 3, 2, 56.5);
    // double[] printMaxnew{1, 2, 3};


public static void printMax(double... numbers) {
    if (numbers.length == 0) {
        System.out.println("No argument passed");
        return;
    }

    double result = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > result) {
            result = numbers[i];
            System.out.println("The max value is "+ result);
        }
    }
}
}
