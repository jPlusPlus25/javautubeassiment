public class Halfpyramid1{
    public static void rotatedHalfPyramidnum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        rotatedHalfPyramidnum(6);
    }
}