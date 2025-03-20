import java.util.Collections;
import java.util.Arrays;

public class Inbuiltsort {
    public static void main(String args[]){
        Integer arr[]={5,4,1,3,2};
        //desending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        //asending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}