public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }

    static int fibo(int n){
        //Base case
        if(n<=1){
            return 1;
        }

        return n * (n-1);
    }
}
