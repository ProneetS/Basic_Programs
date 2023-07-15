import java.util.*;

public class PrintDivisorsOptimized {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number for which you want the divisors: ");
        int n = scn.nextInt();
        System.out.println();

        printDivisorsOptimal(n);

        scn.close();
    }

    public static void printDivisorsOptimal(int n) {
        System.out.println("The divisors of "+ n + " are: ");
        for(int i = 1; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
            if(i != n/i){
                System.out.print(n/i+ " ");
            }
        }
        System.out.println();
    }
}

// Output
// The divisors of 36 are:
// 1 36 2 18 3 12 4 9 7 6


//if you want to sort the output you need to use list and Collection.sort()