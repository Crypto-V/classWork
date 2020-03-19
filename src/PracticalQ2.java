import java.util.Scanner;

//Have no idea how to do the question number 3;
public class PracticalQ2 {
    public static void main(String[] args) {
        String[] books = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter the name of book nr. : " + (i + 1));
            books[i] = input.nextLine();
        }
        for (String titles : books) {
            System.out.print(titles + ",");

        }

        System.out.println("\nEnter the book to be removed: ");
        String bookName = input.nextLine();
        for (int j = 0; j < 1; j++) {

            if (books[j].equals(bookName)) {
                books[j] = null;
            }

        }
        for (String fin : books
        ) {
            System.out.println(fin);
        }
    }


}





