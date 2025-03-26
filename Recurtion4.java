public class Recurtion4 {
    public static int sumCal(int n){
        if(n==0){
            return 1;
        }int sum1=sumCal(n-1);
        int sn=n+sum1;
        return sn;

    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(sumCal(5));
    }
}