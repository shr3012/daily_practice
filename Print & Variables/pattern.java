// *
// **
// ***
// ****
// *****


public class pattern {
    // public static void main(String[] args) {
    //    //outer loop => rows
    //     for (int i = 1; i <= 5; i++){
    //         //columns/star per rows
    //         for (int j =1; j <= i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }       
    // }

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
