package myPack;
import java.util.Scanner;
public class Test 
{
	private int arr[];
	boolean found = false;
	public Test(int arrSize)
	{
		arr = new int[arrSize];
	}
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(1+i +"-Element:");
			arr[i] = sc.nextInt();
		}
	}
	
	
	public boolean isFound(int data)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == data)
			{
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	
}
