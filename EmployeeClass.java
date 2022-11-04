
public class EmployeeClass {

	private String firstName;
	private String lastName;
	private String Position;
	private double salary;
	private double hoursWorked;
	
	public EmployeeClass() 
	{
		this.firstName = "";
		this.lastName = "";
		this.Position = "";
		this.salary = 8.25;
		this.hoursWorked = 0.0;
		
		
	}
	
	public EmployeeClass(String firstName, String lastName, String Position,  double salary, double hoursWorked) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.Position = Position;
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}
	
	//Getters 
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPosition()
	{
		return Position;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public double hoursWorked()
	{
		return hoursWorked;
	}
	//Getter ends here
	
	//Setter
	
	public void setFirstName()
	{
		this.firstName = firstName;
	}
	
	public void setLastName()
	{
		this.lastName = lastName;
	}
	
	public void setPosition()
	{
		this.Position = Position;
	}
	
	public void setSalary()
	{
		this.salary = salary;
	}
	
	public void setHoursWorked()
	{
		this.hoursWorked = hoursWorked;
	}
	//Setter ends here
	
	public double showCurrentPay()
	{
		double pay = 0.0;
		
		if(hoursWorked<= 40)
		{
			pay = hoursWorked * salary;
		}
		
		else
		{
			double overtime = hoursWorked - 40.0;
			pay = (40 * salary) + (overtime * salary * 1.5);
		}
		
		return pay;
	}
	
	public String displayPayCheck()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("====="+firstName.toUpperCase()+""
		+lastName.toUpperCase()+"=====\n");
		sb.append("Hours Worked: "+hoursWorked+"\n");
		sb.append("Position: "+Position+"\n");
		sb.append("Salary: "+salary+"\n");
		sb.append("Total Pay: "+this.showCurrentPay()+"\n");
		return sb.toString();
	}
	
	public static void main(String[] args) 
	{
		EmployeeClass person1 = new EmployeeClass("John", "Doe", "The Boss",20.00, 30);
		System.out.println(person1.displayPayCheck());
		EmployeeClass person2 = new EmployeeClass("Harry", "Potter", "The Boss",20.00, 30);
		System.out.println(person2.displayPayCheck());
	
	}
}
