import java.util.Scanner;

public class Main {
	public static void main(String []arg)
	{
		for(int i=0;i<50;i++)System.out.print("*");System.out.println();
		System.out.println("Enter the strategy code:");
		System.out.println("Press 1 for ScanStrategy, 2 for CircularScanStrategy or 3 for CircularLook:");
		
		Scanner sc=new Scanner(System.in);
		schedulingStrategy strategy;
		int choice=sc.nextInt();
		if(choice==1)
		{
			strategy=new scanStrategy();
		}
		else if(choice==2)
		{

			strategy=new cScanStrategy();
		}
		else
		{
			strategy=new circularLookStrategy();
		}
		System.out.print("Enter The requests number: ");
		int n=sc.nextInt();System.out.println();
		
		System.out.print("Enter the initial postion: ");
		int ini=sc.nextInt();System.out.println();
		int arr[]=new int[n];
		System.out.print("Enter the requests: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		System.out.println();System.out.print("Enter the arm direction: ");
		String dir=sc.next();System.out.println();
		strategy.execute(arr, ini,dir);
		System.out.println();
		for(int i=0;i<50;i++)System.out.print("*");System.out.println();
		sc.close();
	}
}
/**
9 
120
38 180 130
10 50 15
190 90 150

8 53
98 183 37 122 14 124 65 67
**/