import java.util.Scanner;
class Leapyear 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
			int year=scn.nextInt();
		if ((year%400==0) || (year%4==0 && year%100!=0))
		System.out.println("number u given is the leap year");
		else
		System.out.println("It's not a leap year");
	}
}
