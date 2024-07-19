// Single Line Comment

import java.util.Arrays;

/**
 Multiline Comment
 */

public class Basics {

    public static void main(String[] args) {
        byte a = 1;        //1 byte(8bits)
        short b = 2;       //2 byte(16bits)
        int c = 3;         //4 byte (32bits)
        long d = 4;        //8 byte (64bits)
        float e = 5.0f;    //4 byte (32bits)
        double f = 6.0;    //8 byte (64bits)
        char g = 'A';      //2 byte (16bits)
        boolean h = true;  //1 bit

        String i = "Hello World";


        System.out.println(i); // Printing Statement to print in single line
        System.out.println("Hello World"); // Printing Statement to print line by line or after print cursor on next line
        System.out.println("Byte: " + a);

        // Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Increment: " + (a++));
        System.out.println("Decrement: " + (a--));
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Less Than: " + (a < b));
        System.out.println("Greater Than or Equal: " + (a >= b));
        System.out.println("Less Than or Equal: " + (a <= b));
        System.out.println("Logical AND: " + (a < b && a > b));
        System.out.println("Logical OR: " + (a < b || a > b));
        System.out.println("Logical NOT: " + !(a < b && a > b));
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise Complement: " + (~a));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
        System.out.println("Right Shift with Zero: " + (a >>> 1));

        int num1 = 10;
        int num2 = 20;

        // ternary Operator
        int result = (num1 > num2) ? num1 : num2; // if num1 is greater than num2 then num1 else num2
        System.out.println("Ternary Operator: " + result); 

        // if else Statement
        if (num1 > num2) {
            System.out.println("If Statement: " + num1);
        } else {
            System.out.println("If Statement: " + num2);
        }

        // Switch Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // While Loop
        int lopi = 0;
        while (lopi < 5) {
            System.out.println("While Loop: " + lopi);
            lopi++;
        }

        // Do While Loop
        int lopd = 0;
        do {
            System.out.println("Do While Loop: " + lopd);
            lopd++;
        } while (lopd < 5);

        // For Loop
        for (int loop = 0; loop < 5; loop++) {
            System.out.println("For Loop: " + loop);
        }

        // forEach
        int[] arr = {1, 2, 3, 4, 5};
        for (int element : arr) {
            System.out.println("ForEach: " + element);
        }

        // Break Statement
        for (int loop = 0; loop < 5; loop++) {
            if (loop == 3) {
                break;
            }
            System.out.println("Break Statement: " + loop);
        }

        // Continue Statement
        for (int loop = 0; loop < 5; loop++) {
            if (loop == 3) {
                continue;
            }
            System.out.println("Continue Statement: " + loop);
        }

        // Array
        // import java.util.Arrays;
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(Arrays.toString(array));

        // Multi Dimensional Array
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(multiArray));

        //Scanner
        // import java.util.Scanner;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // System.out.println("Number is: " + num);



    }
}