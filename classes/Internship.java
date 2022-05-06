package classes;
import java.lang.*;

public class Internship extends Employee{
   private String time;

	public void setTime(String time)
	{
		this.time=time;
	}
	public String getTime(){
		return time;
	}

    void showInfo(){
    	System.out.println("Internship duration: "+getTime());
    }
}