package wula;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class a315 {
	public static void main(String args[]) {
		int ans = (int)(100+Math.random()*(999-100+1));
		Scanner in = new Scanner(System.in);
		System.out.println("正确的彩票为"+ans);
		String s = in.next();
		String real = Integer.toString(ans);
		
		if(s.equals(real)) 
			System.out.println("奖金为10000");
		else { 
			Map<Character,Integer>mp = new HashMap<Character,Integer>();
			for(int i = 0;i<real.length();i++)
				if(mp.get(real.charAt(i))!=null)
					mp.put(real.charAt(i), mp.get(real.charAt(i))+1);
				else mp.put(real.charAt(i), 1);

			boolean torf=false;
			for(int i = 0;i<s.length();i++)
				if(mp.get(s.charAt(i))!=null)torf=true;
			//System.out.println(torf);
			for(int i = 0;i<s.length();i++)
				if(mp.get(s.charAt(i))!=null)
					mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
			
			Set<Map.Entry<Character,Integer>> entrySet = mp.entrySet();
	        //遍历Set集合
			Iterator<Map.Entry<Character,Integer>> it =entrySet.iterator();
	        boolean flag = true;
	        while(it.hasNext()){
	            Map.Entry<Character,Integer> entry = it.next();
	            Character key = entry.getKey();
	            Integer value = entry.getValue();
	            //System.out.println(key+"."+value);
	            if(value>0)flag = false;
	        }
	        if(flag)System.out.println("3000");
	        else if(torf)System.out.println("1000");
	        else System.out.println("0");
		}
	}
}
