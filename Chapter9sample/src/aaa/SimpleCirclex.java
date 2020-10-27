package aaa;

public class SimpleCirclex {
	public static void main(String[] args) {
		SimpleCirclex circle1 = new SimpleCirclex();
		System.out.println("The area of the circle of radius "
				+ circle1.radius + " is " + circle1.getArea());
		
		SimpleCirclex circle2= new SimpleCirclex(25);
		System.out.println("The area of the circle of radius "
				+ circle2.radius + " is " + circle2.getArea());
		
		SimpleCirclex circle3= new SimpleCirclex(125);
		System.out.println("The area of the circle of radius "
				+ circle3.radius + " is " + circle3.getArea());
		
		circle2.radius = 100;
		System.out.println("The area of the circle of radius "
				+ circle2.radius + " is " + circle2.getArea());
	}
	double radius;
	SimpleCirclex(){
		radius = 1;
	}
	SimpleCirclex(double a){
		radius=a;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2* radius*Math.PI;
	}
	void setRadius(double a) {
		radius = a;
	}
}
