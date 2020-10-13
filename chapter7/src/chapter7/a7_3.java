package chapter7;
import java.util.Scanner;
public class a7_3 {
	public static void main(String args[]) {
		int[] arr = new int[110];
		for(int i = 0;i<110;i++)arr[i]=0;
		int mid=1;
		Scanner in = new Scanner(System.in);
		while(mid>0) {
			mid=in.nextInt();
			arr[mid]++;
		}
		for(int i = 1;i<101;i++) {
			if(arr[i]>0)
				System.out.println(i+" occurs "+arr[i]+(arr[i]==1?"time":"times"));
		}
	}
}
