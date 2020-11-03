package a9_10;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		double a,b,c;
		Scanner in = new Scanner(System.in);
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		QuadraticEquation q = new QuadraticEquation(a,b,c);
		if(q.getDiscriminant()<0)
			System.out.println("The equation has no roots.");
		else if(q.getDiscriminant()>0)
			System.out.println(q.getRoot1()+" "+q.getRoot2());
		else System.out.println(q.getRoot1());
	}
}
