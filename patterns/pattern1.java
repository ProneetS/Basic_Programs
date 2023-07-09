/**
 * pattern1
 */

 //importing package to take input from user 
import java.util.*;
public class pattern1 {

    public static void main(String[] args) {
        
        //Taking user input
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        //For lines
        for(int i = 1; i <= num; i++){

            //For printing *
            for(int j = 1; j <= i; j++){
                
                //Print the *
                System.out.print("*\t");

            }
            System.out.println();
        
        }

        scn.close();

    }
}


// *
// * *
// * * * 
// * * * * 
// * * * * *