//reverce number print
/*public class Eleven {
    public static void main(String args[]){
        int n=10899;
        int counter=0;
        while (n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
        System.out.println();
    }
}*/
//reverce number print
//reverce=(reverce*10)+last digit //reverce=0
public class Eleven {
    public static void main(String args[]){
        int n=10894;
        int reverse=0;
        while (n>0){
        int lastdigit=n%10;
        reverse=(reverse*10)+lastdigit;
        n=n/10;
    }
        System.out.println(reverse);
    }
}