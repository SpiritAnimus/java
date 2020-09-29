package wula;
import java.util.Scanner;
public class a319 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a+b>c&&a+c>b&&b+c>a)
			System.out.println((a+b+c));
		else System.out.println("输入不合法");
	}
}
