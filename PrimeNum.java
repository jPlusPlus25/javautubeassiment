public class PrimeNum {
    public static  boolean Prime(int n) {
        if(n==2){
            return true;
        }
        for (int k = 2; k <Math.sqrt(n); k++) {
            if (n % k == 0) {
                return false;
            }
        }
            return true;
    }
    public static void main(String args[]){
        Prime(3);

    }
}