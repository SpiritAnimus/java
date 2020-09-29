package wula;
import java.util.Scanner;
public class a328 {
	public class arc{
		private double x,y,w,h;
		private double zsx,zsy;
		private double yxx,yxy;
		public arc(){}
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter : ");
		double xx = in.nextDouble();
		double xy=in.nextDouble();
		double xw=in.nextDouble();
		double xh=in.nextDouble();
		System.out.println("Enter : ");
		double yx = in.nextDouble();
		double yy=in.nextDouble();
		double yw=in.nextDouble();
		double yh=in.nextDouble();
		double xzsx = xx-xw/2;
		double xzsy = xy + xh/2;
		double xyxx = xx+xw/2;
		double xyxy = xy-xh/2;
		double yzsx = yx-yw/2;
		double yzsy = yy + yh/2;
		double yyxx = yx+yw/2;
		double yyxy = yy-yh/2;
		boolean l=false,r = false;
		if(yzsx>=xzsx&&yzsy<=xzsy)l=true;
		if(yyxx<=xyxx&&yyxy>=xyxy)r=true;
		//System.out.println(l+"."+r);
		//System.out.println(yzsx+"."+xzsx+"."+yzsy+"."+xzsy);
		if(l&&r)System.out.println("inside");
		else if(l||r)System.out.println("overlaps");
		else System.out.println("not overlaps");
	}
}