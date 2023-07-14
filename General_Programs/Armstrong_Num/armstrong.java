import java.util.*;

public class armstrong {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = scn.nextInt();

        int dup = N;
        int sum = 0;

        while(N > 0){
            int ld = N % 10;
            sum = sum + (ld * ld * ld);
            N = N/10;
        }

        if(sum == dup){
            System.out.println(dup + " is a Armstrong Number.");
        }else{
            System.out.println(dup + " is not an Armstrong Number.");
        }

        scn.close();

    }
    
}
