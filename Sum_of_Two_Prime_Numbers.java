import java.util.Scanner;

public class Sum_of_Two_Prime_Numbers {

    static int prime(int n) {
        if (n <= 1) {
            return 0; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0; // Not a prime number
            }
        }
        return 1; // Prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (prime(i) == 1) {
                if (prime(n - i) == 1) {
                    flag = 1;

                }
            }

        }
        if (flag == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
