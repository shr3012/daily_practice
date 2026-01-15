import java.util.Scanner;
public class multiTable {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number to print its multiplication table: ");
    //     int num = sc.nextInt(); 

    //     for(int i = 1; i <= 10; i++){
    //         System.out.println(num + "*" + i + " = " + (num * i));
    //     }
    //     sc.close();
    // }

    // Print sum of first N natural numbers.
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the value of N: ");
    //     int N = sc.nextInt();
    //     int sum = 0;
    //     for(int i= 0; i<= N; i++){
    //         sum = sum + i;       
    //     }
    //     System.out.println("The sum of first " + N + " natural numbers is: " + sum);
    //     sc.close();
    // }


    // Take a number and count digits.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        System.out.println("The number of digits is: " + count);
        sc.close();
    }
}
