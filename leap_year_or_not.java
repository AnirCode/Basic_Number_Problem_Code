import java.util.*;

class leap_year_or_not {
    static boolean year(int y)
    {
        if(y%4==0 && y%100!=0 || y%400==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int y = sc.nextInt();
        if (year(y)) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not leap year");
        }
    }
}
