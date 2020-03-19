public class PrtacticalQ4 {
    public static void main(String[] args) {
        int eventcount = 0;
        int eventcount1 = 0;
        int[] numbers = {3, 7, 2, 9, 12, 16, 22, -8, 4, 13};
        //in this program we will find out how many odds and even numbers:
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {

                eventcount++;

            }
        }
        System.out.println("Total number of even number is: " + eventcount);

        for (int i = 0; i < numbers.length; i++) {
            if (!(numbers[i] % 2 == 0)) {
//                System.out.println("Even numbers are: "+numbers[i]+" , ");
                eventcount1++;

            }
        }
        System.out.println("Total number of odd numbers is: " + eventcount1);
    }

}


