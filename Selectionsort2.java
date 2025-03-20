import java.util.Scanner;
//Decresing order
public class Selectionsort2 {
    public static void selectionSort(int arr[]){
        for(int t=0;t<arr.length-1;t++){
            int maxp=t;
            for(int j=t+1;j<arr.length;j++){
                if(arr[maxp]<arr[j]){
                    maxp=j;
                }
            }
            //swap
            int temp=arr[maxp];
            arr[maxp]=arr[t];
            arr[t]=temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
}