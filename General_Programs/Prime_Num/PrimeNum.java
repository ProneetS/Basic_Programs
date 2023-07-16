import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check whether its PRIME or Not: ");
        int n = scn.nextInt();
        System.out.println();
        CheckPrime(n);
        scn.close();
    }

    public static void CheckPrime(int n){
        int count = 0;
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                count++;
                    if((n/i) != i){
                    count++;
                }
            }
            
        }

        if(count == 2){
            System.out.println("Number " + n + " is PRIME. ");
        }else{
            System.out.println("Number " + n + " is not PRIME.");
        }
    }
}
