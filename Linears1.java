public class Linears1 {
    public static void linFood(String food[],String key){
       for(int i=0;i<=food.length;i++){
           if(food[i]==key){
               return i;
           }
       }
       return -1;
    }
    public static void min (String args[]){
        String food[]={"Mango","Samosa","Kachori","Sev-puri"};
        linFood(food,"Samosa");
        int index=linFood(food,key);
        if(index==-1){
            System.out.println("out of bound index");
        }else{
            System.out.println("index num is:" +index);
        }
    }
}