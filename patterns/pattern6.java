import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to print the pattern: ");
        int num = scn.nextInt();
        System.out.println();

        int star = num/2 + 1;
        int space = 1;

        // for printing the line

        for(int i = 1; i <= num; i++){
            
            //for printing the star
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }

            //for printing space
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }

            //for printing star
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }

            if( i <= num/2){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }

            System.out.println();
        }
        scn.close();
    }
}



// *       *       *               *       *       *
// *       *                               *       *
// *                                               *
// *       *                               *       *
// *       *       *               *       *       *