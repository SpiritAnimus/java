package project1;
import java.util.*;
public class test {
	public static void main(String[] args) {
		
		ArrayList<book>vec = new ArrayList<book>();
		Map<String,book>mp = new HashMap<String,book>();
		Scanner in = new Scanner(System.in);
		System.out.println("����ͼ����Ϣ������:");
		int n = in.nextInt();
		System.out.println("��������ͼ��ı�� ���� ���� ������:");
		for(int i = 0;i < n;i++) {
			book mid = new book();
			mid.Id=in.next();
			mid.Name=in.next();
			mid.Price=in.nextDouble();
			mid.PublishinghousePress=in.next();
			vec.add(mid);
			mp.put(mid.Id, mid);
		}
		System.out.println("�������:");
		for(book i : vec) {
			System.out.println(i.Id+i.Name+i.Price+i.PublishinghousePress);
		}
		System.out.println("ӳ�����:");
		for(Map.Entry<String,book> entry : mp.entrySet()){
         	System.out.println(entry.getValue().Id+entry.getValue().Name+
         			entry.getValue().Price+entry.getValue().PublishinghousePress);
        } 
			
	}
}
