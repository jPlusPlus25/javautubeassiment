public class Recurtion8 {
    public static int power(int x,int n){
        if(n==1){
            return x;
        }int xnm1=power(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
    //optimized power
    public static int optimizedPow(int a,int n){
        if(n==1){
            return a;
        }
        int halfpowerSq=optimizedPow(a,n/2)*optimizedPow(a,n/2);
        //n is odd
        if(n%2!=0){
            halfpowerSq=a*halfpowerSq;
        }return halfpowerSq;
    }
    public static void main(String args[]){
        System.out.println(power(2,11));
    }
}