
public class BetterStudent3 {

	private String name;
	private int age;
	private String major;
	private String hobby;
	private double gpa;
	private int time_spent;
	
	
	public BetterStudent3()
	{
		this.name = "";
		this.gpa = 0;
		this.time_spent = 0;
	}
	
	public BetterStudent3(String name, int age, String major, 
			String hobby, double gpa, int time_spent) 
	{
		this.name = name;
		this.age = age;
		this.major = major;
		this.hobby = hobby;
		this.gpa = gpa;
		this.time_spent = time_spent;
	}
	
	//Getter
	
	public String getName()
	{
		return name;
	}
	
	public double getAge()
	{
		return age;
	}
	
	public int getTime_Spent()
	{
		return time_spent;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public String getHobby()
	{
		return hobby;
	}
	
	public double getGpa() 
	{
		return gpa;
	}
	//Getters end here
	
	//Setters
	
	public void setName(String name) 
	{
		this.name = name;
	}
	

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public void setMajor(String major) 
	{
		this.major = major;
	}
	
	public void setHobby(String hobby) 
	{
		this.hobby = hobby;
	}
	
	public void setGpa(double expected_GPA) 
	{
		this.gpa = gpa;
	}
	
	public void setTime_Spent(int time_spent) 
	{
		this.time_spent = time_spent;
	}
	
	public String HonorsEligible()
	{
		String Honors;
		
		if(gpa>=3.5 && gpa <= 5.0)
			Honors = "true";
		else
			Honors = "false";
	return Honors;
	}
	
	public static void main(String [] args) 
	{
		BetterStudent3 student1 = new BetterStudent3();
		
		student1.setName("Peter");
		student1.setGpa(3.8);
		student1.setTime_Spent(100);
		
		System.out.println("Student's honors eligibility check "+student1.HonorsEligible());
		
		student1.setGpa(3.2);
		System.out.println("Student's honors eligibility check after second year "+student1.HonorsEligible());
	}
	
}
