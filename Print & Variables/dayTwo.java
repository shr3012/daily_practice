//printing concept

import java.util.Scanner;
public class dayTwo {
    public static void main(String[] args){
        System.out.println("Please Enter the SIZE of the array: ");
        //Input an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of arr: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Required Array is : ");
        //TRAVERSAL OF AN ARRAY
        //for loop
        // for(int i =0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // }
        //for-each loop
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}

