package aaa;

public class CircleWithPrivateDataFields {
	private double radius = 1;
	private static int numberOfObjects = 0;
	public CircleWithPrivateDataFields() {
		numberOfObjects++;
	}
	public CircleWithPrivateDataFields(double a) {
		radius = a;
		numberOfObjects++;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double a) {
		radius = (a>=0)?a:0;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
