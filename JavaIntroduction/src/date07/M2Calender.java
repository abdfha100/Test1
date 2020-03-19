package date07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class M2Calender {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyy hh:mm:ss");
		System.out.println(sdf1.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
	}
}
