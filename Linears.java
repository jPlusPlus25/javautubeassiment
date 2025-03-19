public class Linears {
    public static int linearSerch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,3,5,4,8,9,89,10,3,5,6,8};
        int key=10;
        int index=linearSerch(numbers,key);
        if(index==-1){
        System.out.println("Not found");
    }else{
            System.out.println("key is at a index: "+index);
        }
    }

}