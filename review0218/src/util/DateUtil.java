package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**
	 * String -> Date SimpleDateFormat.parse 이용
	 */
	public static Date toDate(String date) {
		Date result = null;
		// to do
		SimpleDateFormat dateparse = new SimpleDateFormat("yyyy-mm-dd");
		try {
			result = dateparse.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Date -> String SimpleDateFormat.format 이용
	 */
	public static String toStr(Date date) {
		String result = null;
		// to do
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM");
		result = dateformat.format(date);
		return result;

	}

	/**
	 * Date를 주어진 포맷대로 스트링으로 변환 Date -> String SimpleDateFormat.format 이용
	 */
	public static String toStr(Date date, String format) {
		String result = null;
		// to do
		SimpleDateFormat dateformat = new SimpleDateFormat(format);
		result = dateformat.format(date);
		return result;

	}
	//요일, 1년중에 몇일째인지
	public static String toStr1(Date date, String format) {
		String result = null;
		// to do
		SimpleDateFormat dateformat = new SimpleDateFormat("EE-DD일째");
		result = dateformat.format(date);
		return result;
	}
	
}
