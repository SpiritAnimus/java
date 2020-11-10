package aaa;

public class CastingDemo {
	public static void main(String[]args) {
		Object object1 = new CircleFromSimpleGeometricObject(1);
		Object object2 = new RectangleFromSimpleGeometricObject(1,1);
		
		display(object1);
		display(object2);
	}
	public static void display(Object obj) {
		if(obj instanceof CircleFromSimpleGeometricObject) {
			System.out.println("The circle area is "+
					((CircleFromSimpleGeometricObject)obj).getArea());
			System.out.println("The circle diameter is "+
					((CircleFromSimpleGeometricObject)obj).getDiameter());
		}
		else if(obj instanceof RectangleFromSimpleGeometricObject) {
			System.out.println("The rectangle area is " +
					((RectangleFromSimpleGeometricObject)obj).getArea());
		}
	}
}
