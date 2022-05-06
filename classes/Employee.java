package classes;
import java.lang.*;



abstract class Employee
{
	private String empId;
	private String name;
	private double salary;
	private String time;
	
	public void setEmpId(String empId){
		this.empId = empId;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String getEmpId(){
		return empId;
	} 
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	} 
	public void setTime(String time){
		this.time=time;
	}

	public String getTime(){
		return time;
	}
	abstract void showInfo();

}

