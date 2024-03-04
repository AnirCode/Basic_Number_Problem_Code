import java.util.Scanner;

public class Power_of_a_Number {
    static int power(int n, int m) {
        int ans = 1;
        for (int i = 1; i <= m; i++) {
            ans = ans * n;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and its power");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Result is : " + power(n, m));
    }
}
