package a9_11;
import java.util.*;
public class test {
	public static void main(String[] args) {
		double a,b,c,d,e,f;
		Scanner in = new Scanner(System.in);
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		d=in.nextDouble();
		e=in.nextDouble();
		f=in.nextDouble();
		LinearEquation q = new LinearEquation(a,b,c,d,e,f);
		if(q.isSolvable())
			System.out.println(q.getX()+" "+q.getY());
		else System.out.println("The equation has no solution.");
	}
}
