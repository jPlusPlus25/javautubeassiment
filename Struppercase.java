public class Struppercase {
    public static String strUpperCase(String str){
        StringBuilder str1=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        str1.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1 ){
                str1.append(str.charAt(i));
                i++;
                str1.append(Character.toUpperCase(str.charAt(i)));
            }else {
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }
    public static void main(String args[]){
        String str="hi i am arshita";
        System.out.println(strUpperCase(str));

    }
}