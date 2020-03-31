package myPack;
import java.util.Scanner;
public class MyQueue 
{
	Scanner sc = new Scanner(System.in);
	public String displayName()
	{
		System.out.println("Enter Name");
		String name = sc.nextLine();
		return name;
	}
}
