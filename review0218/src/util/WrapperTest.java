package util;

import java.util.Date;

public class WrapperTest {
	// 1. String -> int
//	public static void main(String[] args) {
//		int result = StringUtil.toInt("1234");
//		System.out.println(result);
//	}

	// 2. int -> string
	public static void main(String[] args) {
		String result1 = StringUtil.toString(123);
		System.out.println(result1);

		// 파일명에서 확장자만 추출
		String ext = StringUtil.getExt("a.hwp");
		System.out.println(ext);
		
		//파일명에서 확장자 빼고 파일명만 추출
		String ext1 = StringUtil.getExtt("파일명.hwp");
		System.out.println(ext1);
		
		//경로명에서 파일명만 추출
		String ext2 = StringUtil.getExttt("c:/img/item/p01.jpg");
		System.out.println(ext2);
		
		//String -> Date
		Date result = DateUtil.toDate("2010-02-10");
		System.out.println("String -> Date: "+ result);
		
		//Date -> String
		String str = DateUtil.toStr(new Date());
		System.out.println(str);
		
		String str2 = DateUtil.toStr(new Date(), "yyyy");
		System.out.println(str2);
		
		//요일, 1년중에 몇일째
		String str3 = DateUtil.toStr1(new Date(), "dd");
		System.out.println(str3);
		
	}
}
