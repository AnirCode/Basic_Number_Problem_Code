import java.util.*;

public class Maximum_and_Minimum_Digit_in_a_Number {
    static int Maximum(int n) {
        int max = Integer.MIN_VALUE;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            if (max <= rem) {
                max = rem;
            }
        }
        return max;

    }

    static int Minimum(int n) {
        int min = Integer.MAX_VALUE;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            if (min >= rem) {
                min = rem;
            }

        }
        return min;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Largest digit: " + Maximum(n));
        System.out.println("Smallest digit: " + Minimum(n));
    }
}

// Another method

/*
 * 
 * import java.io.*;
 * class Test
 * {
 * static private void MinMax(int n)
 * {
 * int d;
 * int mini = Integer.MAX_VALUE;
 * int maxi = Integer.MIN_VALUE;
 * while (n != 0)
 * {
 * d = n % 10;
 * mini = Math.min(mini,d);
 * maxi = Math.max(maxi,d);
 * n = n / 10;
 * }
 * 
 * System.out.println("The minimum number is: "+mini);
 * System.out.print("The maximum number is: "+maxi);
 * }
 * public static void main(String[] args)
 * {
 * int n = 4726;
 * MinMax(n);
 * }
 * }
 */
