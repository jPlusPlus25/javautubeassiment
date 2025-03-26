public class Recurtion2 {
    public static void increashingOrder(int n){
        if(n==10){
            System.out.println(10   );
            return;
        }
        System.out.println(n);
        increashingOrder(n+1);
    }
    public static void main(String args[]){
        int n=1;
        increashingOrder(1);
    }
}