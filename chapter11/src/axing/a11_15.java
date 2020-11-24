package axing;
import java.util.*;
public class a11_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<point>arr = new ArrayList<point>();
		int n = in.nextInt();
		for(int i = 0;i<n;i++) {
			double a = in.nextDouble();
			double b = in.nextDouble();
			point ths = new point(a,b);
			arr.add(ths);
		}
		double area = 0;
		for(int i = 2;i<n;i++)
			area+=cal(arr.get(0),arr.get(i-1),arr.get(i));
		System.out.println(area);
	}
	public static double cal(point a,point b,point c) {
		double A,B,C,P;
		A = Math.sqrt(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2));
		B = Math.sqrt(Math.pow(b.x-c.x, 2)+Math.pow(c.y-b.y, 2));
		C = Math.sqrt(Math.pow(a.x-c.x, 2)+Math.pow(a.y-c.y, 2));
		P=(A+B+C)/2;
		return Math.sqrt(P*(P-A)*(P-B)*(P-C));
	}
}
