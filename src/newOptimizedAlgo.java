import java.util.Arrays;

public class newOptimizedAlgo implements schedulingStrategy{
	private int requests[];
	public int initialPos;
	private int sequence[];
	newOptimizedAlgo(){
		initialPos=0;
	}
	public void setReqs(int []arr,int sz)
	{
		requests=new int[sz];
		sequence=new int[sz];
		for(int i=0;i<sz;i++)
		{
			requests[i]=arr[i];
		}
	}
	public void serveReq(int request) {}
	@Override
	public void execute(int[] arr, int initialPos, String direction) {
		int totalDistance=initialPos;
		setReqs(arr,arr.length);
		Arrays.sort(requests);
		for(int i=0;i<arr.length;i++)
		{
			serveReq(requests[i]);
			sequence[i]=requests[i];
		}
		totalDistance+=requests[arr.length-1];
		System.out.println("The total distance for the new optimized algorithm is: "+totalDistance);
		System.out.println("The requests sequnce is: ");
		for(int i=0;i<sequence.length;i++)
		{
			System.out.print(sequence[i]+" ");
		}System.out.println();
	}

}
