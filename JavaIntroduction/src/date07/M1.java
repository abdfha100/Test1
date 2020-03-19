package date07;

import java.text.SimpleDateFormat;
import java.util.Date;

//Current date, current time...//
public class M1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
		//  mm/dd/yyy/ HH:MM:SS  (Required date format)
		//http://tutorials.jenkov.com/java-date-time/parsing-formatting-dates.html
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("M/d/yyyy/hh:mm:ss");
		System.out.println(sdf2.format(date));
		
	}

}
