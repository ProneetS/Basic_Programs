import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers to calculate the GCD or HCF: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println();

        CalculateGCD(num1, num2);
        scn.close();
    }

    public static void CalculateGCD(int num1, int num2){
        while(num1 > 0 && num2 > 0){
            if(num1 > num2){
                num1 = num1 % num2;
            }else{
                num2 = num2 % num1;
            }
        }

        if(num1 == 0){
            System.out.println(num2);
        }else{
            System.out.println(num1);
        }

    }
}
