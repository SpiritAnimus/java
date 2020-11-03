package a9_10;

public class QuadraticEquation {
	private double a,b,c;
	QuadraticEquation(double x,double y,double z){
		a=x;
		b=y;
		c=z;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		double dat = getDiscriminant();
		if(dat<0)return 0;
		else return (-b+Math.sqrt(dat))/(2*a);
	}
	public double getRoot2() {
		double dat = getDiscriminant();
		if(dat<0)return 0;
		else return (-b-Math.sqrt(dat))/(2*a);
	}
}
