package wula;
import java.util.Scanner;
public class a322 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		System.out.print("Point ("+x+", "+y+") is ");
		if(x*x+y*y<100)
			System.out.print("in the circle");
		else System.out.print("not in the circle");
			
	}
}
