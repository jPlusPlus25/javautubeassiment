public class Largearray {
    public static int largNum(int[] num){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if (largest < num[i]) {
                largest=num[i];
            }
        }
        return (int)largest;

    }
    public static void main(String args[]){
    int num[]={3,6,4,8,9,2};
        System.out.println("largest value :"+getlargest(num));
    }
}