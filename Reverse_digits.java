import java.util.*;

class Reverse_digits {
  static int Reverse(int n) {
    int res = 0, rem;
    while (n > 0) {
      rem = n % 10;
      res = res * 10 + rem;
      n = n / 10;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    System.out.println("After Reverse: " + Reverse(n));
  }
}
