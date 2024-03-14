package Day3;

public class Sample {
    private int rollno;
    private String cname;
    private String address;
    
    public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
class Test{
	
	public static void main(String args[]) {
		Sample cus=new Sample();
    	cus.setRollno(19);
    	cus.setCname("Dhivya Dharshini");
    	cus.setAddress("8,Sundaraj Street,Mudaliyarpet, Pondicherry - 605004");
    	System.out.println("My roll is "+ cus.getRollno());
    	System.out.println("My Name is "+ cus.getCname());
    	System.out.println("My Address is "+ cus.getAddress());
	}
	
	
}
