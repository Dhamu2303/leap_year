package Leap_Years;
import java.util.Scanner;

public class Find_Leap_Years {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the year:");
		int year = scanner.nextInt();
		scanner.close();
		boolean isLeapYear= false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					isLeapYear= true;
				}
			}
			else {
				isLeapYear= true;
			}
		}
		if(isLeapYear) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.print(year+" is a non-Leap Year");
		}
	}
}


