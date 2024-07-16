public class Methods {
    public static void add(int a, int b){
        System.out.println("Addition of "+a+" & "+b+" is "+(a+b));
    }
    public static void sub(int c, int d) {
        System.out.println("Subtraction of "+c+" & "+d+" is "+(c-d));
    }
    public static void multi(int x, int z) {
        System.out.println("Multiplication of "+x+" & "+z+" is "+(x*z));
    }
    public static void main(String[] args) {
        add(10, 20);
        sub(6, 4);
        multi(5, 5);
    }
}
