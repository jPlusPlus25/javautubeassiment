import java.util.*;
public class Fifteen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int oddsum = 0;
        int evensum=0;
        for (int i = 1; i <= k; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("that is even number:" + n);
                evensum=evensum+n;
                System.out.println("that is sum:" +evensum);
            } else {
                System.out.println("that is odd number:" + n);
                oddsum=oddsum+n;
                System.out.println("that is even number sum:" +oddsum);
            }

        }

    }
}