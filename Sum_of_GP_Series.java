import java.util.*;

class Sum_of_GP_Series {
    static double sum(int n, double a, double r) {
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result = result + a;
            a = a * r;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term count : ");
        int n = sc.nextInt();
        System.out.println("Enter the first term: ");
        double a = sc.nextDouble();
        System.out.println("Enter the common ratio: ");
        double r = sc.nextDouble();
        System.out.println("The sum of gp series is : " + sum(n, a, r));
    }
}
