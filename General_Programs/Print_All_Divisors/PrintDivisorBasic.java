import java.util.*;

public class PrintDivisorBasic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number for which you want the divisors: ");
        int n = scn.nextInt();
        System.out.println();
        printDivisors(n);
        
        scn.close();
    }
    
    public static void printDivisors(int n){
        for(int i = 1; i <= n; i++){
            if( n%i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
