import java.util.*;

public class scanStrategy implements schedulingStrategy {
	private int []requests;
	private int myInitialPos;
	public binarySearch binarysearch;
	scanStrategy()
	{
		binarysearch=new binarySearch();
	}
	public void setRequests(int []arr)
	{
		int sz=arr.length;
		requests=new int [sz];
		for(int i=0;i<sz;i++)requests[i]=arr[i];
	}
	@Override
	public void execute(int arr[],int initialPos,String direction) {
		setRequests(arr);
		myInitialPos=initialPos;
		//int processed=0;
		int totalDistance=0;
		Arrays.sort(requests);
		Vector<Integer>sequence=new Vector<Integer>();
		{
			int start=binarySearch.upperBound(requests,requests.length,initialPos);
			if(direction.equals("left"))
			{
				for(int i=start-1;i>=0;i--)
				{
					totalDistance+=Math.abs(myInitialPos-requests[i]);
					myInitialPos=requests[i];
					sequence.add(requests[i]);
				}
				totalDistance+=(requests[0]-0);

				myInitialPos=0;
				for(int i=start;i<requests.length;i++)
				{
					totalDistance+=Math.abs(requests[i]-myInitialPos);
					myInitialPos=requests[i];
					sequence.add(requests[i]);
				}
				System.out.println("The total distance for Scan algorithm is: "+totalDistance);
				System.out.println("The requests sequnce is: ");
				for(int i=0;i<sequence.size();i++)
				{
					System.out.print(sequence.elementAt(i)+" ");
				}System.out.println();
			}
			else
			{
				for(int i=start;i<requests.length;i++)
				{
					totalDistance+=Math.abs(requests[i]-myInitialPos);
					myInitialPos=requests[i];
					sequence.add(requests[i]);
				}
				for(int i=start-1;i>=0;i--)
				{
					totalDistance+=Math.abs(myInitialPos-requests[i]);
					myInitialPos=requests[i];
					sequence.add(requests[i]);
				}
				totalDistance+=(requests[0]-0);
				System.out.println("The total distance for Scan algorithm is: "+totalDistance);
				System.out.println("The requests sequnce is: ");
				for(int i=0;i<sequence.size();i++)
				{
					System.out.print(sequence.elementAt(i)+" ");
				}System.out.println();
				
			}
		}
	}
	
}
