import java.util.Scanner;
public class number {
    // public static void main(String [] args){
    //     Scanner sc = new Scanner(System.in);
    //     for(int i = 1; i <= 100; i++){
    //         System.out.println(i);
    //         if(i == 50){
    //             break;
    //         }
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     for(int i = 1; i <= 100; i++){
    //         if(i%3 == 0){
    //             continue;
    //         }
    //         System.out.println(i);
    //     }
    // }
    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     while (true) {
    //         System.out.print("Enter a number (0 to stop): ");
    //         int num = sc.nextInt();

    //         if (num == 0) {
    //             break; // stop when user enters 0
    //         }

    //         System.out.println("You entered: " + num);
    //     }

    //     System.out.println("Program stopped.");
    //     sc.close();
    // }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            int num = sc.nextInt();

            if (num < 0) {
                break; // stop when negative number is entered
            }

            if (num > 0) {
                sum += num; // add only positive numbers
            }
        }

        System.out.println("Sum of all positive numbers: " + sum);
        sc.close();
    }
}
