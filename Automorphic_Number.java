import java.util.*;

public class Automorphic_Number {

    static boolean Automorphic(int n) {
        int sq = n * n;
        while (n > 0) {
            if (sq % 10 != n % 10) {
                return false;
            }
            sq = sq / 10;
            n = n / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (Automorphic(n) == true) {
            System.out.println("It is Automophic number");

        } else {
            System.out.println("It is not Automorphic number");
        }
    }
}
