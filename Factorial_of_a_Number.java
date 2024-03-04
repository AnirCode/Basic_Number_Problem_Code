import java.util.Scanner;

public class Factorial_of_a_Number {
    static int fact(int n) {
        int facto = 1;
        for (int i = n; i > 0; i--) {
            facto = facto * i;
        }
        return facto;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Result is " + fact(n));
    }
}