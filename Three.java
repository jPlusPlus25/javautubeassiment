public class Three {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;//x=x+y;   //4
        y -= z;//y=y-z;  //0
        z /= (x + y);  //z=z/(x+y);  //0
        System.out.println("x:"+ x + " y:"+ y + " Z:"+ z);
    }
}