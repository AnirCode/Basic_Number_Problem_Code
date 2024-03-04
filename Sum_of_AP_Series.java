import java.util.*;

class Sum_of_AP_Series {
    static int sum(int n, int a, int d) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + a;
            a = a + d;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series count");
        int n = sc.nextInt();
        System.out.println("Enter the 1st term: ");
        int a = sc.nextInt();
        System.out.println("Enter the common difference: ");
        int d = sc.nextInt();
        System.out.println("The sum of AP Series " + sum(n, a, d));
    }
}
