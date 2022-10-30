public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = productofdigits(55);
        System.out.println(ans);
    }

    static int productofdigits(int num){
        //base case
        if(num%10==num) return num;

        return productofdigits(num/10) * (num%10);
    }
}
