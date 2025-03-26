public class Recurtion7 {
    public static int fistOccurence(int arr[],int key,int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }return fistOccurence(arr, key, i+1);

    }
    public static void main(String args[]){
        int arr[]={8,9,4,3,5,7,9,8};
        System.out.println(fistOccurence(arr,9,0));
    }
}