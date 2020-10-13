package chapter7;
import java.util.Scanner;
public class a7_17 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int maxn = in.nextInt();
		String[] name = new String[maxn];
		int[] score = new int[maxn];
		for(int i = 0;i<maxn;i++) {
			name[i] = in.next();
			score[i]=in.nextInt();
		}
		for(int i = 0;i<maxn;i++)
			for(int j = i+1;j<maxn;j++)
				if(score[j]>score[i])
				{
					int temp = score[i];
					String tems = name[i];
					score[i]=score[j];
					name[i]=name[j];
					score[j]=temp;
					name[j]=tems;
				}
		for(int i = 0;i<maxn;i++)
			System.out.println(name[i]);
	}
}
