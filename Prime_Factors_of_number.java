import java.util.*;

public class Prime_Factors_of_number {

    static void prime_Factor(int n) {
        System.out.println("Prime Factors are: ");
        for (int i = 2; n > 1; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        prime_Factor(n);

    }
}
