import java.util.*;

class Greatest_of_two_numbers {

    static int Greatest(int m, int n) {
        if (m > n) {
            return m;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("The greatest number is : " + Greatest(m, n));
    }

}
