import java.util.*;

public class count{


    static int count_digits(int n){
        int x = n;
        int count = 0;

        while ( x != 0 ){
            x = x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N = scn.nextInt();
        System.out.println("Number of digits in "+N+" is "+count_digits(N));
        scn.close();
    }
}