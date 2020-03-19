import java.util.ArrayList;
import java.util.Scanner;

public class PracticalQ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<>();
        double x = 0;
        double sum = 0;
        while (x != -999.00) {
            System.out.println("Add number: ");
            x = scanner.nextDouble();
            arr.add(x);
            if (x == -999.00) {

            } else {
                sum += x;
            }
            scanner.nextLine();
        }
        double average = sum / arr.size();
        System.out.println("The average is: " + average);

    }
}












