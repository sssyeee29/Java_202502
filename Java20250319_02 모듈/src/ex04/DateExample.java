package ex04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateExample {

	public static void main(String[] args) {

		Date now = new Date(); //  setter역할 
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // Month랑 Hour은 반드시 대문자로 기입 
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
	}

}
