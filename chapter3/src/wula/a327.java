package wula;
import java.util.Scanner;
public class a327 {
	public static double f(double x) {
		return -x/2+100;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a point with x- and y-coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		System.out.print("Point is ");
		if(x>0&&y>0&&f(x)>y)
			System.out.print("in the triangle");
		else System.out.print("not in the triangle");
			
	}
}