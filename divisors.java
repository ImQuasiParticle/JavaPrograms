import java.lang.Math;
import java.util.*;
import java.io.*;

public class divisors {

    // method to print the divisors
    static void printDivisors(int n) {
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                a.add(i);
                if (n / i != i) {
                    a.add(n / i);
                }
            }
        }
        Collections.sort(a);
        System.out.println(a);
    }

    // Driver method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number");
        int n = sc.nextInt();
        System.out.println("The divisors of" + n + " are: ");
        printDivisors(n);

    }
}