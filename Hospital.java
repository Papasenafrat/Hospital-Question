import java.util.Scanner;

public class Hospital 
{

	private String h_name;
	private Doctor[]D;
	private Nurse[]N;

	
	void readHospital()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("No of Doctors ");
		int n=sc.nextInt();
		D=new Doctor[n];
		for(int i=0;i<n;i++)
		{
			D[i]=new Doctor();
			D[i].readDoctor();
		}
		System.out.println("Enter Hospital name:");
		h_name=sc.next();
		
		System.out.println("No of Nurses:");
		int m=sc.nextInt();
		N=new Nurse[m];
		for(int i=0;i<m;i++)
		{
			N[i]=new Nurse();
			N[i].readNurse();
		}
		sc.close();
		
	}
	void showHospital()
	{
		System.out.println("Hospital name: "+h_name);

		for(int i=0;i<D.length;i++)
		{
			D[i].showDoctor();
		}
		for(int i=0;i<N.length;i++)
		{
			N[i].showNurse();
		}
		
			 }
	
}
