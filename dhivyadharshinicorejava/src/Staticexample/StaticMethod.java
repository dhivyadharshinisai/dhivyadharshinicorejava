package Staticexample;

public class StaticMethod {
    int id=123;
    static int rollno=34;
    static {
    	System.out.println("This is the static block");
//    	System.out.println("ID : "+id);
//    	Static block only contains static variables 
    	System.out.println("Roll NO : "+rollno);
    }
    StaticMethod(){
    	System.out.println("ID : "+id);
    	System.out.println("Roll no : "+rollno);
    }
    void display() {
    	System.out.println("Normal method");
    }
    static void Print() {
    	System.out.println("This is a static Method");
    	System.out.println("The roll no is:"+rollno);
    }
    
}
