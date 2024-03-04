import java.util.*;

class palindrome_range {
    static boolean pal(int i) {
        int res = 0, rem;
        int data = i;
        while (i > 0) {
            rem = i % 10;
            res = res * 10 + rem;
            i = i / 10;

        }
        if (res == data) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st digit of range: ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd digit of range: ");
        int y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            if (pal(i)) {
                System.out.println(i + " ");
            }
        }

    }
}
