import java.util.*;

public class GCD_of_two_numbers {

    static void GCD(int n, int m) {
        int ans = 1;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                ans = i;
            }
        }
        System.out.println("GCD is " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Number: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        GCD(n, m);
    }
}
