package chapter7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class a7_32 {
	public static int partition(int[] a) {
		int head=0,ass=a.length-1;
		while(head!=ass) {
			if(a[head]>a[head+1])
			{
				a[head]^=a[head+1];
				a[head+1]^=a[head];
				a[head]^=a[head+1];
				head++;
			}
			else {
				a[ass]^=a[head+1];
				a[head+1]^=a[ass];
				a[ass]^=a[head+1];
				ass--;
			}
		}
		return ass;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int maxn=in.nextInt();
		int[] arr = new int[maxn];
		for(int i = 0;i<maxn;i++)arr[i]=in.nextInt();
		System.out.println(partition(arr));
		for(int i:arr)
			System.out.print(i+" ");
	}
}
