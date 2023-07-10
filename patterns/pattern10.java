import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to print the pattern: ");
        int num = scn.nextInt();
        System.out.println();

        int outspace = num/2;
        int innerspace = -1;

        for(int i = 1; i <= num; i++){
            
            //printing outer space
            for(int j = 1; j <= outspace; j++){
                System.out.print("\t");
            }

            System.out.print("*\t");

            //printing inner spcae
            for(int j = 1; j <= innerspace; j++){
                System.out.print("\t");
            }

            //print inner star
            if(i > 1 && i < num){
                System.out.print("*\t");
            }

            //logic for outspace and inner space
            if( i <= num/2){
                outspace--;
                innerspace+=2;
            }else{
                outspace++;
                innerspace-=2;
            }

            System.out.println();
        }

        scn.close();
    }
}



//                 *
//         *               *
// *                               *
//         *               *
//                 *