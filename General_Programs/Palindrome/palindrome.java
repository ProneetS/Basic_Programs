import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = scn.nextInt();

        int dup = N;
        int reverse = 0;
        while(N > 0){
            int lastdig = N % 10;
            reverse = (reverse * 10) + lastdig;
            N = N / 10;
        }
        if(dup == reverse){
            System.out.println("The Number " + dup + " is Palindrom");
        }else{
            System.out.println("The Number " + dup + " is not Palindrom");
        }

        scn.close();

    }
    
}


//Palindrome are the numbers for which reverse is exactly same as the original one.
//eg: 121 (Palindrome)    123(Not Palindrome)

//Time complexity O(Log10(N))