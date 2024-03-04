import java.util.*;

public class Area_of_Circle {

    static void area(int n) {
        double pi = 3.14;
        System.out.println(" Area = " + pi * n * n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the redius of circle: ");
        int n = sc.nextInt();
        area(n);
    }
}
