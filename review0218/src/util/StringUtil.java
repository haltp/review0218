package util;

public class StringUtil {
	// 1. String -> int
	public static int toInt(String s) {	//Integer -> int
		if (s == null)
			return -1;
		return Integer.parseInt(s);
	}
	// 2. int -> string
	public static String toString(int a) {
		if(a == 0)
			return null;
		return Integer.toString(a);
	}
	// 3. string -> 확장자(String) : LastIndexOf, substr
	public static String getExt(String b) {
		String result="";
		//to do
		result = b.substring(b.lastIndexOf(".")+1);
		return result;
	}
	
	// 4. string-> path, 파일명
	public static String getExtt(String pathname) {
		String result="";
		result = pathname.substring(0, pathname.lastIndexOf("."));
		return result;
	}
	
	// 5. 경로명에서 파일명만 추출
	/**
	 * 파일명에서 확장자를 추출
	 * @param pathname
	 * 		경로명 "c:/img/item/p01.jpg"
	 * @return 파일명 p01.jpg, 경로 c:/img/item
	 */
	public static String getExttt(String pathname) {
		String result="";
		result = pathname.substring(pathname.lastIndexOf("/")+1);
		return result;
	}
	
}
