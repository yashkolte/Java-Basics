import java.util.Scanner;

public class ProblemSolve {

    //! 1. Enter 3 numbers from the user & make a function to print their average.
    // public static int average(int first, int second, int third){
    //     return (first + second + third)/3;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter First Number : ");
    //     int first = sc.nextInt();
    //     System.out.print("Enter Second Number : ");
    //     int second = sc.nextInt();
    //     System.out.print("Enter Third Number : ");
    //     int third = sc.nextInt();

    //     System.out.println("The Average of "+ first + ", " + second + " and " + third + " number is : "+ average(first, second, third));
    // }

    //! 2. Write a function to print the sum of all odd numbers from 1 to n

    // public static int SumOfOddNumber(int number){       
    //     int sum = 0;
    //     for(int i = 1; i <= number; i++){
    //         if(i % 2 != 0){
    //             sum += i;
    //         }
    //     }
    //     return sum;
    // }
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter The Number : ");
    //     int number = sc.nextInt();
    //     System.out.println("The Sum of all the odd number from 1 to " + number + " is : " + SumOfOddNumber(number));
    // }

    //! 3. Write a function that take two numbers and return the Greatest of those two.

    // public static boolean FindTheLargest(int first, int second){
    //     return (first > second) ?  true : false;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the first number : ");
    //     int first = sc.nextInt();
    //     System.out.print("Enter the second number : ");
    //     int second = sc.nextInt();
    //     if (FindTheLargest(first, second)) {
    //         System.out.println(first + " is larger then " + second);
    //     } else {
    //         System.out.println(second + " is larger then " + first);
    //     }
    // }

    //! Write a function that takes in the radius as input and returns the circumference of a circle
    
    // public static double CalcCircum(int radius){
    //     double circumference = 2 * 3.14 * radius;
    //     return circumference; 
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the radius of the circle : ");
    //     int radius = sc.nextInt();
    //     System.out.println("The Circumference of " + radius+ " is : " + CalcCircum(radius));
    // }

    //! 5. Write the function that takes in age as input in return if that person is eligible to vote or not .A person of age greater than 18 is eligible to vote
    
    // static String ageCalc(int age){
    //     String check = "";
    //     if(age > 0){
    //         check = age > 18 ? "Your are eligible to vote" : "You are not eligible to vote";
    //     } else {
    //         check = "Enter a valid Age.";
    //     }
    //     return check;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Your Age : ");
    //     int age = sc.nextInt();
    //     System.out.println(ageCalc(age));
    // }

    //! 6. Write a infinite loop using do while condition.
    
    // public static void main(String[] args) {
    //     do{
    //         System.out.println("Hello world");
    //     } while(true);
    // }

    //!  8. Two numbers are entered by the user X and N write the function to find the value of one number raised to the power of another.

    // public static int pow(int x, int n) {
    //     int pow = (int) Math.pow(x, n);
    //     return pow;
    // }

    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.print("Enter the first number : ");
    //     int x = sc.nextInt();
    //     System.out.print("Enter the second number : ");
    //     int n = sc.nextInt();
    //     System.out.println("The Power of " + x + " ^ " + n + " is : " +  pow(x, n));
    // }

    //! 9. Write a function that calculates the greatest common divisor of two numbers.

    // static int factor(int x, int y) {
    //     int gcd = 1;
    //     for(int i = 1; i <= x; i++ ){
    //         if(x % i == 0 && y % i == 0){
    //             gcd = i;
    //         }
    //     }
    //     return gcd; 
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the first number : ");
    //     int first = sc.nextInt();
    //     System.out.print("Enter the second number : ");
    //     int second = sc.nextInt();
    //     System.out.println("The greatest common divisor of " + first + " and " + second + " is " + factor(first, second));
    // }

    //! Fibonacci Series

    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i <= num; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
