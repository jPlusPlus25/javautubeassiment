import java.util.Scanner;
//incresing order
public class Selectionsort1 {
    public static void selectionSort(int arr[]){
        for(int t=0;t<arr.length-1;t++){
            int minp=t;
            for(int j=t+1;j<arr.length;j++){
              if(arr[minp]>arr[j]){
                  minp=j;
              }
            }
            //swap
            int temp=arr[minp];
            arr[minp]=arr[t];
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