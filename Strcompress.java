public class Strcompress {
    public static String compress(String str){
        StringBuilder st=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i) ==str.charAt(i+1)){
                count++;
                i++;
            }
            st.append(str.charAt(i));
            if(count>1){
                st.append(count);
            }

        }
        return st.toString();
    }
    public static void main(String args[]){
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
}