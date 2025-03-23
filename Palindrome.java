import java.util.Scanner;

public class Palindrome {
    public static boolean isPalimdrome(String a){
        for (int i=0;i<a.length()/2;i++){
            int n=a.length();
            if(a.charAt(i)!=a.charAt(n-1-i)){
                return false;
            }
        }return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(isPalimdrome(a));

    }
}