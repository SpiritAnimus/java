package aaa;

public class PolymorphismDemo {
	public static void displayObject(SimpleGeometricObject obj) {
		System.out.println("Created on "+obj.getDateCreated()+
				". Color is " + obj.getColor());
	}
	public static void main(String[]args) {
		displayObject(new CircleFromSimpleGeometricObject
				(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObject
				(1,1,"black",true));
	}
}
