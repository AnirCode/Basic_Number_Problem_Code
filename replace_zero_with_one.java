import java.util.*;

public class replace_zero_with_one {

    static void replace(int n) {
        int rem, sum = 0, r, ans = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem != 0) {
                sum = sum * 10 + rem;

            } else {
                sum = sum * 10 + 1;
            }

            n = n / 10;
        }
        while (sum > 0) {
            r = sum % 10;
            ans = ans * 10 + r;
            sum = sum / 10;
        }
        System.out.println("The digit is: " + ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        replace(n);
    }
}
