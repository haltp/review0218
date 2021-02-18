package util;

import java.util.ArrayList;

public class ListUtil {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//추가(무조건 젤 끝에)
		list.add("포도");
		
		//삽입(중간에 삽입)
		list.add(0,"사과");
		
		//수정
		list.set(1, "바나나");
		
		//삭제
		list.remove(0);
		
		//단건조회
		list.get(0); //위에 0번을 지웠으니 1번이 0번이 됨
		
		//전체조회
		System.out.println(list);
	}
}
