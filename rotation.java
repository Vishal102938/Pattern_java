import java.util.Scanner;

public class rotation {
    public static int number(int n) {
        int right = n % 10;    
        int left = n / 10; 
        int digits = (int) Math.log10(n); 
        
        return right * (int) Math.pow(10, digits) + left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();

        int rotatedNum = number(n);
        System.out.println("Rotated number: " + rotatedNum);
    }
}