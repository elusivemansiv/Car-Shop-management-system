package classes;
import java.lang.*;
import interfaces.*;

public class Market implements EmployeeOperations,ShopOperations
{
   private Shop shops[] = new Shop[100];
   private Internship employees[] = new Internship[200];
   
   
   
   public void insertShop(Shop s)
	{
		int flag = 0;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == null)
			{
				shops[i] = s;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("Bike Inserted");
		}
		else{
			System.out.println("Bike can Not be Inserted");
		}
	}
	
	public void removeShop(Shop s)
	{
		int flag = 0;
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] == s)
			{
				shops[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("Bike Removed");
		}
		else{
			System.out.println("Bike can Not be Removed");
		}
	}
	
	public Shop getShop(String sid)
	{
		Shop s = null;
		
		for(int i=0; i<shops.length; i++)
		{
			if(shops[i] != null)
			{
				if(shops[i].getSid().equals(sid))
				{
					s = shops[i];
					break;
				}
			}
		}
		return s;
	}
	
	public void showAllShops( )
	{
		for(Shop s : shops)
		{
			if(s!= null)
			{
				System.out.println("**********************************");
				System.out.println("Shop Name: "+ s.getName());
				System.out.println("Shop Id: "+ s.getSid());
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
				System.out.println();
			}
		}
	}
   
   
   
   
   public void insertEmployee(Internship e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("Vehicle Inserted");
		}
		else{
			System.out.println("Vehicle can Not be Inserted");
		}
	}
	
	public void removeEmployee(Internship e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Vehicle Removed");}
		else{System.out.println("Vehicle can Not be Removed");}
	}
	public void showAllEmployees()
	{
		System.out.println("/////////////////////////////////");
		for(Internship e : employees)
		{
			if(e!= null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println("Duration: "+ e.getTime());
				System.out.println();
			}
		}
		System.out.println("/////////////////////////////////");
	}
	
	public Internship getEmployee(String empId)
	{
		Internship e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	
}