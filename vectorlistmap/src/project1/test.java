package project1;
import java.util.*;
public class test {
	public static void main(String[] args) {
		
		ArrayList<book>vec = new ArrayList<book>();
		Map<String,book>mp = new HashMap<String,book>();
		Scanner in = new Scanner(System.in);
		System.out.println("输入图书信息的数量:");
		int n = in.nextInt();
		System.out.println("依次输入图书的编号 名称 单价 出版社:");
		for(int i = 0;i < n;i++) {
			book mid = new book();
			mid.Id=in.next();
			mid.Name=in.next();
			mid.Price=in.nextDouble();
			mid.PublishinghousePress=in.next();
			vec.add(mid);
			mp.put(mid.Id, mid);
		}
		System.out.println("链表遍历:");
		for(book i : vec) {
			System.out.println(i.Id+i.Name+i.Price+i.PublishinghousePress);
		}
		System.out.println("映射遍历:");
		for(Map.Entry<String,book> entry : mp.entrySet()){
         	System.out.println(entry.getValue().Id+entry.getValue().Name+
         			entry.getValue().Price+entry.getValue().PublishinghousePress);
        } 
			
	}
}
