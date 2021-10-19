import java.util.Scanner;
class Switch 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int j=scn.nextInt();
		switch(j){
			case 1:
			System.out.println("Sunday");
			break;
			case 2:
			System.out.println("monday");
			break;
			case 3:
			System.out.println("Tuesday");
			break;
			default:
			System.out.println("Out of the range");
			break;}
	}
}
