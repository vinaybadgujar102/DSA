public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumofdigits(1452);
        System.out.println(ans);
    }

    static int sumofdigits(int num){
        //base case
        if(num==0) return 0;

        return sumofdigits(num/10) + (num%10);
    }
}
