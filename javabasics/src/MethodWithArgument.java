import java.util.Scanner;

public class MethodWithArgument {

    public static boolean CheckEvenOdd(int num) {
        boolean checkResult = num%2==0 ? true : false;
        return checkResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = sc.nextInt();
        boolean result = CheckEvenOdd(userInput);
        if(result==true){
            System.out.println("Java");
        } else {
            System.out.println("Python");
        }
    }
}
