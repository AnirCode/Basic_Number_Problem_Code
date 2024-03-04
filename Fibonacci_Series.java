import java.util.*;

public class Fibonacci_Series {
    static void fibo(int n) {
        int n1 = 0, n2 = 1, n3 = 0;
        while (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            n--;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term: ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        fibo(n - 2);
    }
}
