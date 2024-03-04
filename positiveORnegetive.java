import java.util.*;

class positiveORnegetive {
    static boolean number(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non Zero number");
        int n = sc.nextInt();
        if (number(n)) {
            System.out.println("It is positive number");
        } else {
            System.out.println("It is negetive number");
        }
    }
}
