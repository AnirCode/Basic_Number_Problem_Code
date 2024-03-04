import java.util.*;

class SumOFnumber {
    static int sum(int n) {
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 = sum1 + i;
        }
        return sum1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The sum is " + sum(n));
    }
}
