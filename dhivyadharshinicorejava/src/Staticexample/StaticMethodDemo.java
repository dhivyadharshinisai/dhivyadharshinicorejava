package Staticexample;

public class StaticMethodDemo {
	static {
		System.out.println("Static block in main file");
	}
    public static void main(String args[]) {
    	System.out.println("Main Function");
    	StaticMethod st1=new StaticMethod();
    }
}
