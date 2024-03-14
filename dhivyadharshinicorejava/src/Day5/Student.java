package Day5;

public class Student extends Citizen{
    private int student_id;
    private String course;
    public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
    Student(){
    	System.out.println("The object for Student class is created...");
    }
    Student(int citizen_id, String citizen_name,int citizen_age,int student_id, String course){
    	super(citizen_id,citizen_name,citizen_age);
    	this.student_id=student_id;
    	this.course=course;
    }
    @Override
    public String toString() {
    	return "Student is id "+getStudent_id()+" student's course is "+getCourse()+" Citizen id is"+super.getCitizen_id()+"Citizen name is"+super.getCitizen_name()+"Citizen's age is "+super.getCitizen_age();
    }
}
