package chapter7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class a7_24 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String[] card= {"2","3","4","5","6","7","8","9","10"
				,"Jack","Queen","King","Ace"};
		String[] color = {"Clubs","Spades","Hearts","Diamonds"};
		int tot=0;
		int cd[] = new int[4];
		int cl[] = new int[4];
		Arrays.fill(cl, -1);
		int num=0;
		while(cl[0]==-1||cl[1]==-1||cl[2]==-1||cl[3]==-1) {
			num++;
			Random random = new Random();
			int ncl = random.nextInt(4);
			boolean used = false;
			for(int i = 0;i<tot;i++)
				if(cl[i]==ncl)used=true;
			if(!used) {
				int nnb = random.nextInt(13);
				cl[tot]=ncl;
				cd[tot++]=nnb;
			}
		}
		for(int i = 0;i<4;i++)
			System.out.println(card[cd[i]]+" of "+color[cl[i]]);
		System.out.println("Number of picks:"+num);
	}

}
