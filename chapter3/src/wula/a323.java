package wula;
import java.util.Scanner;
public class a323 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		System.out.print("Point ("+x+", "+y+") is ");
		if(x>-5&&x<5&&y>-2.5&&y<2.5)
			System.out.print("in the rectangle");
		else System.out.print("not in the rectangle");
			
	}
}