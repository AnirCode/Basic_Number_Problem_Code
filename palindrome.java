import java.util.*;

class palindrome {
    static int pal(int n) {
        int res = 0, rem;
        int data = n;
        while (n > 0) {
            rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        if (data == res) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = pal(n);
        if (result == 0) {
            System.out.println("It is not palindrome number");
        } else {
            System.out.println("It is palindrome Number");
        }
    }
}