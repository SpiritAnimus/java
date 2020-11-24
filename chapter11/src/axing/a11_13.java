package axing;
import java.util.*;
public class a11_13 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int j;
		for(int i = 0;i<10;i++) {
			j=in.nextInt();
			arr.add(j);
		}
		removeDuplicate(arr);
	}
	public static void removeDuplicate(ArrayList<Integer> real) {
		Map<Integer,Integer>mp = new HashMap<Integer,Integer>();
		for(int i = 0;i<real.size();i++)
			if(mp.get(real.get(i))!=null)
				mp.put(real.get(i), mp.get(real.get(i))+1);
			else mp.put(real.get(i), 1);
		boolean f = true;	
		 for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
			 if(!f) {
				 System.out.print(" ");
			 }
			 else f=false;
			 System.out.print(entry.getKey());
		 } 
         
        
	}
}
