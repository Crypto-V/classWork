import java.util.ArrayList;
import java.util.Scanner;

public class PracticalQ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        ArrayList<String> words = new ArrayList<>();
        while (!word.equals("terminator")) {
            System.out.println("Enter one word: ");
            word = input.nextLine();

            if (word.equals("terminator")) {

            } else {
                words.add(word);
            }
        }
        System.out.println(words);

        System.out.println("Enter the location of the array: ");
        int arrayLocation = input.nextInt();
        input.nextLine();
        try {
            System.out.println(words.get(arrayLocation));
        } catch (IndexOutOfBoundsException e) {
            while (arrayLocation > words.size()) {
                System.out.println("Enter the new location of the array: ");
                arrayLocation = input.nextInt();
                input.nextLine();
            }
            System.out.println("Your requested word is: " + words.get(arrayLocation));
        }
        System.out.println("THis array have : " + words.size() + " elements.");


    }
}
