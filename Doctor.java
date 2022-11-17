import java.util.Scanner;

public class Doctor extends Person 
{

	//private String d_name;
	private String department;
	private int id;
	private int room_no;
	private String nurse;

	void readDoctor()
	{
		Scanner sc=new Scanner (System.in);
		this.readPerson();
		 System.out.println("Enter Doctor's Department:");
		 department=sc.nextLine();

		System.out.println("Enter id Number:");
		id=sc.nextInt();

		System.out.println("Enter room no:");
		room_no=sc.nextInt();
		System.out.println("Enter Nurse Name:");
		nurse=sc.nextLine();
		sc.close();
		
	}
	void showDoctor()
	{
		this.showPerson();
		System.out.println("Doctor's Department is: "+department);
		System.out.println("Id number is: "+id);
		 	System.out.println("Associated Nurse: "+nurse);
	 	System.out.println("Room Number: "+room_no);
	
		
	}
}
