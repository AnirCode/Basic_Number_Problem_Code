import java.util.Scanner;

public class Factors_of_a_Number {
    static void Factor(int n) {
        System.out.println("The factors are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Factor(n);
    }
}
