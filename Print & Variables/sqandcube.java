// Take an integer and print its square and cube.
import java .util.Scanner;
public class sqandcube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Square of " + num + " is: " + (num * num));
        System.out.println("Cube of " + num + " is: " + (num * num * num));
        sc.close();
    }
}
