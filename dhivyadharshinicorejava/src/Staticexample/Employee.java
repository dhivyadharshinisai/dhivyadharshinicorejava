package Staticexample;

public class Employee {
    String name;
    int id;
    static String Company_name = "TNS Foundation";
    Employee(String name,int id){
    	this.name=name;
    	this.id=id;
    }
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]"+ "Company Name [Companyname= "+Company_name+"]" ;
	}
    
}
