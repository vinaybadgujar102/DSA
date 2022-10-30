public class ReverseInt {
    //Method 1: using sum variable
    static int sum = 0;
    static void reverse1(int n){
        //base case
        if(n==0) return;

        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }

    //Method 2: using helper function
    static int reverse2(int n){
        int digits = (int)(Math.log10(n))+1;  //Formulae to calculate no. of digits in integer
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n) return n;
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        reverse1(1234);
        System.out.println(sum);

        System.out.println(reverse2(4321));
    }

}
