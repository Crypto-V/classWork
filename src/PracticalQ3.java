import java.util.Scanner;

public class PracticalQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n =scanner.nextInt();
        double[] arr = new double[n];
        double x = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element No." + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {

            x = x + arr[i];

        }
        double average = x / 5;
        System.out.println("The average is: " + average);


    }
}

