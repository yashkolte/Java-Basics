import java.util.*;

public class ArraysUseage {
    public static void main(String[] args) {

        // String[] subject = new String[5];
        // subject[0] = "English";
        // subject[1] = "Hindi";
        // subject[2] = "Social";
        // subject[3] = "Science";
        // subject[4] = "Maths";

        // ======================== OR ===========================
        
        // String[] subject = {"English", "Hindi", "Social", "Science", "Maths"};
        
        // ======================== // ===========================
        // System.out.println(subject.length);
        // ======================== // ===========================

        // System.out.println(subject[0]);
        // System.out.println(subject[1]);
        // System.out.println(subject[2]);
        // System.out.println(subject[3]);
        // System.out.println(subject[4]);

        // ======================== OR ===========================

        // for (int i = 0; i < subject.length; i++) {
        //     System.out.print(subject[i] + " ");
        // }
        
        // ======================== OR ===========================
        
        // for (String str : subject) {
        //     System.out.println(str);
        // }

        // ======================== OR ===========================
        
        // System.out.println(Arrays.toString(subject));

        // ======================== OR ===========================
        
        // System.out.println(Arrays.asList(subject));
        
        // ======================== OR ===========================

        // Arrays.stream(subject).forEach(System.out::println);

        // Input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            if(i == 1){
                System.out.print("Enter The " + i + " st number : ");
            } else if(i == 2) {
                System.out.print("Enter The " + i + " nd number : ");
            } else if(i == 3) {
                System.out.print("Enter The " + i + " rd number : ");
            } else {
                System.out.print("Enter The " + i + " th number : ");
            }
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.println(Arrays.toString(arr));

    }
}
