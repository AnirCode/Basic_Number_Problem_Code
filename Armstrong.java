import java.util.*;

class Armstrong {
    static boolean isArmstrong(int n) {
        int temp = n, result = 0, rem;
        while (n > 0) {
            rem = n % 10;
            result = rem * rem * rem + result;
            n = n / 10;
        }
        if (result == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
