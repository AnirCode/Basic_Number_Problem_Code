import java.util.*;

class prime_range {
    static boolean isprime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st digit of range: ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd digit of range: ");
        int y = sc.nextInt();
        System.out.println("prime numbers are: ");
        for (int i = x; i <= y; i++) {
            if (isprime(i) && i != 1) {
                System.out.println(i);
            }
        }
    }
}
