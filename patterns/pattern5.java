/**
 * pattern5
 */

import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to print the pattern: ");
        int num = scn.nextInt();
        System.out.println();

        int space = num/2;
        int star = 1;

        //for printing lines
        for(int i = 1; i <= num; i++){

            //for printing space
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }

            //for printing the star
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }

            if(i <= num/2){
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }

            System.out.println();
        }

        scn.close();
    }
}



//                 *
//         *       *       *
// *       *       *       *       *
//         *       *       *
//                 *  


