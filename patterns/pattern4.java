
/**
 * pattern4
 */

 import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //For taking input from the user
        System.out.println("Enter the number to print the pattern: ");
        int num = scn.nextInt();
        System.out.println();

        int space = num - 1;
        int star = 1;

        //For Lines count
        for(int i = 1; i <= num; i++){

            //for printing space
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }

            //for printing star
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }

            space--;
            star++;
            System.out.println();
        }

        scn.close();
    }
}



//         *
//       * *
//     * * *
//   * * * * 
// * * * * *