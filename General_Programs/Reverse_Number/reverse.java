import java.util.*;


public class reverse {

    static int reverse_num(int n){
        int num = n;
        int reverse = 0;
        while(n != 0){
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int N = scn.nextInt();
            System.out.println("The reverse of the number " + N + " is "+ reverse_num(N));

            scn.close();
    }    
}


//Time complexity O(log10(N))

//Note: If a number has a trailing zeroes, then its reverse will not include them 
//eg: 10400 will be 401 and not 00401

