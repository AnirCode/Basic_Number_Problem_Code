import java.util.*;

public class Strong_Number {

    static void Strong(int n) {
        int temp = n, sum = 0;
        int rem;
        while (n > 0) {
            int fact = 1;
            rem = n % 10;
            for (int i = 1; i <= rem; i++) {

                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;

        }

        if (sum == temp) {
            System.out.println("It is a strong Number");

        } else {
            System.out.println("It is not a strong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        Strong(n);
    }
}
