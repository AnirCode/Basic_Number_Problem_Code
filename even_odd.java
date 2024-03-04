import java.util.*;

class even_odd {
    static boolean ch(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (ch(n)) {
            System.out.println("It is a even number");
        } else {
            System.out.println("It is a odd number");
        }
    }
}
