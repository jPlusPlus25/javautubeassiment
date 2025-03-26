public class Recurtion5{
    public static int fiboNum(int n){
        if(n==0||n==1) {
            return n;
        }
            int fbn1=fiboNum(n-1);
            int fbn2=fiboNum(n-2);
            int fbn=fbn1+fbn2;
            return fbn;
    }

    public static void main(String args[]){
        int n=6;
        System.out.println(fiboNum(6));
    }
}