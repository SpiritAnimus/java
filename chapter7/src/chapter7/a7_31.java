package chapter7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class a7_31 {
	public static int[] merge(int[] a,int[] b) {
		int[] c = new int[a.length+b.length];
		int tot=0,sa=0,sb=0;
		while(tot<c.length) {
			if(sa==a.length)
				c[tot++]=b[sb++];
			else if(sb==b.length)
				c[tot++]=a[sa++];
			else {
				if(a[sa]<b[sb])
					c[tot++]=a[sa++];
				else c[tot++]=b[sb++];
			}
		}
		return c;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int[] a=new int[l];
		for(int i = 0;i<l;i++)a[i]=in.nextInt();
		l=in.nextInt();
		int[] b=new int[l];
		for(int i = 0;i<l;i++)b[i]=in.nextInt();
		int[] c = merge(a,b);
		for(int i:c)
			System.out.print(i+" ");
	}
}
