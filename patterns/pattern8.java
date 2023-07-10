import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to print the pattern: ");
        int num = scn.nextInt();
        System.out.println();

        //for printing outer lines
        for(int i = 1; i <= num; i++){

            //for printing star
            for(int j = 1; j<= num; j++){
                if(i + j == num + 1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
        scn.close();
    }
}


//                                 *
//                         *
//                 *
//         *
// *