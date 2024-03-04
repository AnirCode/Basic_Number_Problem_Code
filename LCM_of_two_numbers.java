import java.util.*;

public class LCM_of_two_numbers {

    static void LCM(int n, int m) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }

        }
        System.out.println("LCM is : " + (n * m / gcd));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        LCM(n, m);
    }
}
