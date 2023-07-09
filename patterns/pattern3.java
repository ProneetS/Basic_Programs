import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        int space = 0;
        int star = num;

        //For reading the lines
        for(int i = 1; i <= num; i++){

            //Printing the space
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }

            //Printing star
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }

            space++;
            star--;
            System.out.println();
        }

        scn.close();
    }
}


// * * * * *
//   * * * *
//     * * *
//       * *
//         *
