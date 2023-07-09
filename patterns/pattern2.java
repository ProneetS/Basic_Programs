
/* Import file for taking input */
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        //For outer lines
        for(int i = 1; i <= num; i++){

            //For printing *
            for(int j = num; j >= i; j--){

                //Print the *
                System.out.print("*\t");

            }

            System.out.println();
            
        }

        scn.close();
    
    }
}


// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
