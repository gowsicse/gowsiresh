 import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%4==0) && (n%100!=0))
		{
		System.out.println("yes");
		}
		else if(n%100==0)
		{
		System.out.println("no");
		}
		else if(n%400==0)
		{
		System.out.println("yes");
		}
		else
		{
		System.out.println("no");
		}
	}
}
