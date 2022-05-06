import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		System.out.println();
		
		System.out.println("****************Welcome to Vehicle Market Management Application*****************");

		System.out.println();
		
		boolean repeat = true;
		while(repeat)
		{
			System.out.println("Which Vehicle You Want to Choose ?");
			System.out.println("---1. Car");
			System.out.println("---2. MotorBike");
			System.out.println("---3. Exit");

			System.out.print("Your Choice: ");
		  
		    try
		{	   
			int choice = sc.nextInt();
			
			switch(choice)
		    {
				case 1:
				
					System.out.println("");
					System.out.println("You have choosen Car");
					
					System.out.println("Choose any one Option from the followings :");
					System.out.println(" 1. Insert New Car.  2.Get a Car   3.Remove Car  4. Show All Cars  5. Go Back");
					System.out.println();
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Car");
							
							System.out.print("Enter Car ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Car Name: ");
							String name1 = sc.next();
							System.out.println("Set Top Speed: ");
							String time1= sc.next();
							System.out.print("Enter Price: ");
							double salary1 = sc.nextDouble();
							
							Internship e1 = new Internship();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							e1.setTime(time1);
							
							m.insertEmployee(e1);
							{

								frwd.writeInFile("Car Added: "+ e1.getName()+" Speed: "+ e1.getTime()+" months"+"  Salary :"+e1.getSalary()+"  Id :"+e1.getEmpId());
							}
							
							System.out.println("########################");
							break;
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Get a Car");
							
							System.out.print("Enter Car ID: ");
							String empId2 = sc.next();
							
							Internship e2 = m.getEmployee(empId2);
							
							if(e2 !=null)
							{
								System.out.println();
								System.out.println("Car ID: "+e2.getEmpId());
								System.out.println("Car Name: "+e2.getName());
								System.out.println("Car Speed: "+e2.getTime()+" months");
								System.out.println("Car Price: "+e2.getSalary());
								System.out.println();
							}
							else { System.out.println("Car Not Found");}
							{

								frwd.writeInFile("Car you got: "+ e2.getName()+"Car Speed : "+e2.getTime()+" months"+"  Salary :"+e2.getSalary()+"  Id :"+e2.getEmpId());
							}
							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Remove a Car");
							
							System.out.print("Enter Car ID: ");
							String empId3 = sc.next();
							
							Internship e3 = m.getEmployee(empId3);
							
							if(e3 != null)
							{
								m.removeEmployee(e3);
							}
							{

								frwd.writeInFile("Car you removed: "+ e3.getName()+" Car Speed: "+e3.getTime()+"  Salary :"+e3.getSalary()+"  Id :"+e3.getEmpId());
							}
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Show All Cars");
							m.showAllEmployees();
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("");
					break;
					
				case 2:
				
					System.out.println("");
					System.out.println("You have choosen MotorBike");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println(" 1. Insert New MotorBike   2.Remove MotorBike   3.Show All MotorBikes   4.Search a MotorBike   5.Go Back ");
					
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New MotorBike");
							
							System.out.print("Enter Bike ID: ");
							String sid1 = sc.next();
							System.out.print("Enter Bike Name: ");
							String name1 = sc.next();
							
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
						
							m.insertShop(s1);
							{

								frwd.writeInFile("Bike you inserted: "+ s1.getName()+" Bike Top Speed: "+"  Id :"+s1.getSid());
							}

							
							System.out.println("########################");
							break;
								
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove a Bike");
							
							System.out.print("Enter Bike ID: ");
							String sid2 = sc.next();
							
							Shop s2 = m.getShop(sid2);
							
							if(s2 != null)
							{
								m.removeShop(s2);
							}
							{

								frwd.writeInFile("Bike you removed: "+ s2.getName()+" Bike Top Speed: "+"  Id :"+s2.getSid());
							}

							
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Bikes");
							m.showAllShops( );
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a Bike ");
							
							System.out.print("Enter Bike ID: ");
							String sid3 = sc.next();
							
							Shop s3 = m.getShop(sid3);
							
							if(s3 !=null)
							{
								System.out.println();
								System.out.println("Bike ID: "+s3.getSid());
								System.out.println("Bike Name: "+s3.getName());	
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					System.out.println("");
					break;
				
								
				case 3:
				
					System.out.println("********************");
					System.out.println("Exit");
					repeat = false;
					System.out.println("********************");
					break;
					
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
					
					
			}
			
		} 
            catch(InputMismatchException ime)
			{
				System.out.println("InputMismatchException occured");
				System.out.println("Please Enter Correct Input");
				String a = sc.next();
			}
			catch(NullPointerException npe)
			{
				System.out.println("NullPointerException occured");		
                System.out.println("Your input information does not exist");
				
			}
			catch(Exception e)
			{
				System.out.println("Exception occured ");
				e.printStackTrace();
				String a = sc.next();
				
			}
			
		}	
	}
	
}