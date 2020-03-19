import java.util.ArrayList;
import java.util.Scanner;

public class JustArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Enter one word: ");
        String userWord=input.nextLine();

        while(!userWord.equals("stop")){
            words.add(userWord);
            System.out.print("enter word: ");
            userWord=input.nextLine();
        }
        for(String cars:words){
            System.out.print(cars+" ");
        }
    }

}


