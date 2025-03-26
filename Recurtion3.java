public class Recurtion3 {
    public static int facNum(int n){
        if(n==0){
            return 1;
        }//int fnm1=facNum(n-1);
        int fn=n*facNum(n-1);
        return fn;
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(facNum(3));
    }
}