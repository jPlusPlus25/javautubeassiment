public class Decimal {
    public static void decToBinary(int n){
        int myNum=n;
        int binNum=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum +(rem*(int) Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary from of "+myNum+" = "+ binNum);
    }
    public static void main(String args[]){
        decToBinary(8);
    }
}