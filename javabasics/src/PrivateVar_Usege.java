import java.util.Scanner;
public class PrivateVar_Usege {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Price: ");

        int price = sc.nextInt();
        PrivateVar p = new PrivateVar();
        p.setPrice(price);
        if (p.getPrice() != 0) {
            System.out.println("Price is: " + p.getPrice());
        }
    }
}
