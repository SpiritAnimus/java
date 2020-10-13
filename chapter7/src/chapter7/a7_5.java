package chapter7;
import java.util.Arrays;
import java.util.Scanner;
public class a7_5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		Arrays.fill(arr, -1);
		int len = 0;
		for(int i = 0;i<10;i++) {
			int mid = in.nextInt();
			boolean used = false;
			for(int j = 0;j<len;j++)
				if(arr[j]==mid)used=true;
			if(!used)
				arr[len++]=mid;
		}
		System.out.println(len);
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
	}
}
