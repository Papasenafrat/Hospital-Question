import java.util.Scanner;

public class Nurse {

	String n_nm;
	int id;
	
	
	void readNurse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nurse Name:");
		n_nm=sc.next();
		System.out.println("Enter Nurse id:");
		id=sc.nextInt();
		sc.close();
	}
	void showNurse()
	{
		System.out.println("Nurse name is: "+n_nm);
		System.out.println("Nurse id is: "+id);
	}
}
