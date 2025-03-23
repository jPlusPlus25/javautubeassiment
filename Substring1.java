public class Substring1 {
    public static String getSubString(String str,int si,int ei){
        String subString="";
        for (int i=si; i<ei; i++){
            subString+=str.charAt(i);
        }return subString;

    }
    public static void main(String args[]){
        //substring
        String str="Helloworld";
        System.out.println(getSubString(str,3,7));

    }
}