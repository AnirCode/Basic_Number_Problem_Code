import java.util.*;

public class Add_two_fractions {

    static void Fraction(int x1, int y1, int x2, int y2) {
        int div;
        int x3 = (x1 * y2) + (x2 * y1);
        int y3 = y1 * y2;
        if (x3 > y3) {
            div = y3;
        } else {
            div = x3;
        }
        for (int i = div; i > 1; i--) {
            if (x3 % i == 0 && y3 % i == 0) {
                x3 = x3 / i;
                y3 = y3 / i;
            }
        }
        System.out.println("Fraction is : " + x3 + "/" + y3);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numerator and denominator: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 2nd numerator and denominator: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Fraction(a, b, x, y);
    }
}
