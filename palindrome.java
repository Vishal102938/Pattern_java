import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        palin(a);
    }
    public static void palin(int a) {
        int b = a;
        int s = 0;
        while(a>0)
        {
            int r=a%10;
            s=s*10+r;
            a=a/10;
        }
        if(b==s)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }
}
