package caaa;
import java.util.Date;
public class a9_3 {
	public static void main(String[] args) {
		Date date = new Date();
		//System.out.println(date);
		long ms = 1000;
		for(int i = 0;i<8;i++) {
			ms*=10;
			Date dat = new Date();
			dat.setTime(date.getTime()+ms);
			System.out.println(dat.toString());
		}
	}
}
