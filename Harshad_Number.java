import java.util.*;

public class Harshad_Number {

    static void Harshad(int n)
    {
        int temp=n, rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(temp%sum==0)
        {
            System.out.println("Is is Harshad number");
        }
        else
        {
            System.out.println("It is not Harshad number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Harshad(n);
    }
}
