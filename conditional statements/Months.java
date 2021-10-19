import java.util.Scanner;
class Months 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the month  year:-");
		Scanner scn=new Scanner(System.in);
		int i=scn.nextInt();
		int j=scn.nextInt();
		switch(i){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("it has 31 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("it has 30 days");
				break;
			case 2:
				if((j%400==0) || (j%4==0 && j%100!=0))
				System.out.println("it has the 29 years because of leap year");
			    else
				System.out.println("it has 28 days");
		}

	}
}
