public class Student {  // create class and student is a datamember
    int stuid;   //that is a  variable
    String stuname;
    String stucity;

    public void study(){  //study() is a function
        System.out.println(stuname +" is studying");
    }
    public void showFullDetails(){ // that is function
        System.out.println("my  city name is "+stucity);
    }
    public static void main(String[] args) {
        Student std=new Student();//student is a class data type -->now creating object of student-->new keyword is a dynamic memory allocated in java program
        std.stuid=101;
        std.stuname="Arshita";
        std.stucity="Rajkot";
        std.showFullDetails();
        std.study();

    }
    

    
}
