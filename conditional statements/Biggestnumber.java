import java.util.Scanner;
class Biggestnumber 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		if(a>b&&a>c)
			System.out.println("A is the biggest number");
		else if(b>c)
			System.out.println("b is the largest number");
		else
			System.out.println("c is the largest number");
	}
}
