package aaa;

public class RectangleFromSimpleGeometricObject 
	extends SimpleGeometricObject {
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject() {
	}
	public RectangleFromSimpleGeometricObject(
			double width,double height) {
		this.width=width;
		this.height = height;
	}
	public RectangleFromSimpleGeometricObject(
			double width,double height,String c,boolean f) {
		this.width=width;
		this.height=height;
		setColor(c);
		setFilled(f);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double w) {
		width=w;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		height = h;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter()
	{
		return 2*(width+height);
	}
}
