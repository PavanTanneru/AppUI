import java.util.Scanner;
class EvenOrodd
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);

		System.out.println("Enter the number:- ");
		int i=scn.nextInt();
		if (i%2==0)
			System.out.println(i+" is even");
		else
			System.out.println(i+" is odd");

	}
}
