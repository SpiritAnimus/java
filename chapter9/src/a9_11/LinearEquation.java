package a9_11;

public class LinearEquation {
	private double a,b,c,d,e,f;
	LinearEquation(double x,double y,double z,double q,double w,double r){
		a=x;
		y=b;
		c=z;
		d=q;
		e=w;
		f=r;
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
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public double getM() {
		return a*d-b*c;
	}
	public boolean isSolvable() {
		return Math.abs(getM())>1e-9;
	}
	public double getX() {
		return (e*d-b*f)/getM();
	}
	public double getY() {
		return (a*f-e*c)/getM();
	}
	
}

