import java.util.*;

public class PrintDivOptimizedSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number for which you want the divisors: ");
        int n = scn.nextInt();
        System.out.println();

        printDivisorsOptimalSort(n);

        scn.close();
    }

    public static void printDivisorsOptimalSort(int n) {
        List<Integer> list=new ArrayList<Integer>();

        System.out.println("The divisors of "+ n + " are: ");

        for(int i = 1; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);
            }
            if(i != n/i){
                list.add(n/i);
            }
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
