import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exercise {
    public static void main(String[] args) {
        // Exercise 1
        // Create a variable to store the name of a person and print it
        String name = "John Doe";
        System.out.println("Name: " + name);

        // Exercise 2
        // Create a variable to store the age of a person and print it
        int age = 25;
        System.out.println("Age: " + age);

        // Exercise 3
        // Create a variable to store the height of a person and print it
        float height = 5.8f;
        System.out.println("Height: " + height);

        // Exercise 4
        // Create a variable to store the weight of a person and print it
        double weight = 70.5;
        System.out.println("Weight: " + weight);

        // Exercise 5
        // Create a variable
        // to store the name of a person
        // to store the age of a person
        // to store the height of a person
        // to store the weight of a person
        // and print all the variables
        String name1 = "Jane Doe";
        int age1 = 30;
        float height1 = 5.5f;
        double weight1 = 60.5;
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Height: " + height1);
        System.out.println("Weight: " + weight1);

        // Exercise 6
        // Write a book and to check given number is even or odd if number is even print
        // happy new year if number is odd print happy birthday

        int num = 10;
        if (num % 2 == 0) {
            System.out.println("Happy New Year");
        } else {
            System.out.println("Happy Birthday");
        }

        // Exercise 7
        // Write a program create two variables which hold integer value product the values and check result is multiply of two or not
        int num1 = 10;
        int num2 = 20;
        int result = num1 * num2;
        if (result % num1 == 0 && result % num2 == 0) {
            System.out.println("Result is multiply of two");
        } else {
            System.out.println("Result is not multiply of two");
        }

        //Exercise 8
        //Write a program to display excellent message when student get a grade display good message student get degrade improve fail if student gets C grade by using switch and also with if else leadder
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Degrade");
                break;
            default:
                System.out.println("Fail");
        }

        grade = 'A';

        if (grade == 'A') {
            System.out.println("Excellent");
        }
        else if (grade == 'B') {
            System.out.println("Good");
        }
        else if (grade == 'C') {
            System.out.println("Degrade");
        }
        else {
            System.out.println("Fail");
        }

        //Exercise 9
        //Write a program to print 'have a nice day' for 20 times
        for (int i = 0; i < 20; i++) {
            System.out.println("Have a nice day");
        }

        //Exercise 10
        //Write a program to print a value from 20 to 15 by using for loop
        for (int i = 20; i >= 15; i--) {
            System.out.println(i);
        }

        //Exercise 11
        //write a program to print even values from one to hundred
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Exercise 12
        //Write a program to count the even values from 200 to 300 if the count of even value is more than 20 print 'excuse me' if not print 'hat ja'
        int count = 0;
        for (int i = 200; i <= 300; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        if (count > 20) {
            System.out.println("Excuse me");
        } else {
            System.out.println("Hat ja");
        }

        //Exercise 13
        //Write a program to take input as each check the age if age is less than 18 print not eligible to vote if age is greater than 18 print statement eligible to vote if the value enter by user is negative print statement invalid age
        int age2 = 20;
        if (age2 < 0) {
            System.out.println("Invalid age");
        } else if (age2 < 18) {
            System.out.println("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }

        //Exercise 14
        // Write a program to take five integer values from the user by using for loop
        // Import Statement -> import java.util.Scanner;
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Enter a number: ");
        //     Scanner scan = new Scanner(System.in);
        //     int num3 = scan.nextInt();
        //     System.out.println("Number: " + num3);
        // }

        //Exercise 15
        /* Import Statement -> 
        import java.util.Scanner;
        import java.util.ArrayList;
        import java.util.List; */
        
        List<Integer> numbers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int inputnum = scan.nextInt();
            numbers.add(inputnum);
        }

        System.out.println("Numbers: ");
        for (int inputnum : numbers) {
            System.out.println(inputnum);
        }

    }
}