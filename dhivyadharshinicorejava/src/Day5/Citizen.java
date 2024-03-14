package Day5;

public class Citizen {
    private int citizen_id;
    private String citizen_name;
    private int citizen_age;
    public int getCitizen_id() {
		return citizen_id;
	}
	public void setCitizen_id(int citizen_id) {
		this.citizen_id = citizen_id;
	}
	public String getCitizen_name() {
		return citizen_name;
	}
	public void setCitizen_name(String citizen_name) {
		this.citizen_name = citizen_name;
	}
	public int getCitizen_age() {
		return citizen_age;
	}
	public void setCitizen_age(int citizen_age) {
		this.citizen_age = citizen_age;
	}
	
    public Citizen() {
    	System.out.println("The object for Citizen is created...");
    }
    public Citizen(int citizen_id, String citizen_name, int citizen_age) {
    	this.citizen_id = citizen_id;
    	this.citizen_name = citizen_name;
    	this.citizen_age = citizen_age;
    }
}