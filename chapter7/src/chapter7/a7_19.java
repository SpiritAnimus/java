package chapter7;
import java.util.Scanner;
public class a7_19 {
	public static boolean isSorted(int[] list) {
		for(int i = 1;i<list.length;i++)
			if(list[i-1]>list[i])return false;
		return true;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int maxn = in.nextInt();
		int[] arr = new int[maxn];
		for(int i = 0;i<maxn;i++)arr[i]=in.nextInt();
		System.out.println("The list is "+(isSorted(arr)?"already":"not")+" sorted");
	}
}
