import java.util.*;
public class Fifteen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("that is even number:" + n);
            } else {
                System.out.println("that is odd number:" + n);
            }
            sum=sum+n;
            System.out.println("sum of the even and odd: "+ sum);
        }

    }
}