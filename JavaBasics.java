import java.util.Scanner;

public class JavaBasics {
    public static void printHeloWorld(){
        System.out.println("hello world");
    }
    public static int calculateSum(int a,int b){
        int sum=a+b;
         return sum;
    }
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static int factoria(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        } return f; 
    }
    public static void main(String args[]){
        printHeloWorld();//function call
         Scanner sc=new Scanner(System.in);
         int product=multiply(10,20);
        System.out.println(product);
        System.out.println(factoria(7));



    }

}