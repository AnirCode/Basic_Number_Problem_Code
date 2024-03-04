import java.util.*;

class Parfect_Number {
    static boolean Parfect(int n) {
        int result = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                result = result + i;
            }
        }
        if (result == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (Parfect(n)) {
            System.out.println("It is a parfect number");
        } else {
            System.out.println("It is not a parfect number");
        }
    }
}
