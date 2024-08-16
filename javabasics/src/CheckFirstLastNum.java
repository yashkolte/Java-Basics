import java.util.Scanner;

public class CheckFirstLastNum {

    public static int FirstDigit(int n){
        while(n>=10) {
            n/=10;
        }
        return n;
    }
    public static int LastDigit(int n){
        return (n % 10);
    }

    public static void main(String[] args) {
        System.err.print("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.err.println("First Digit of "+ num + " is " + FirstDigit(num) + " , Last digit is " + LastDigit(num));
    }
}
