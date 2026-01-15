import java.util.Scanner;

class number{
    int a;
    int b;

    void add(){
        int ans = a + b;
        System.out.println("Sum of a and b is : " + ans);
    }
}
public class Main {
    public static void main(String [] args){

        number i = new number();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        i.a = sc.nextInt();
        System.out.print("Enter value of b : ");
        i.b = sc.nextInt();
        i.add();

        sc.close();

    }
}