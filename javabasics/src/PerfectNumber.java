public class PerfectNumber {
        static void isPerfectNumber(long N) {
            int sum = 0;
            for(int i=1; i<=N; i++) {
                if(N%i == 0 && i != N){
                    System.out.println(i);
                    sum += i;
                }
            }
            if(sum == N){
                System.out.println(sum);
                System.out.println("perfect Number");
            }
            else {
                System.out.println(sum);
                System.out.println("not a perfect Number");
            }
        }
};

class Solution extends PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(6);
    }
}
