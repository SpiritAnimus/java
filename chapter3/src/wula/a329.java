package wula;
import java.util.Scanner;
public class a329 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter: ");
		double ax = in.nextDouble(),ay=in.nextDouble(),ar=in.nextDouble();
		double bx = in.nextDouble(),by=in.nextDouble(),br=in.nextDouble();
		double dis = Math.sqrt(Math.pow(ax-bx, 2)+Math.pow(ay-by, 2));
		if(dis+br<ar)
			System.out.println("inside");
		else if(dis<br+ar)
			System.out.println("overlaps");
		else System.out.println("not overlaps");
	}
}
