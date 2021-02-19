package oop;

import java.util.ArrayList;

/**
 * 다향성
 * 1. 부모타입의 참조변수가 자식 객체를 참조할 수 있다.
 * 2. 실행되는 메서드는 참소하는 객체(= new Prof(), = new Emp())의 메서드를 호출 (실행결과 다를 수 있다)
 * 
 * 다향성 쓰는 이유
 * 만약 배열로 쓰면 상속받는 클래스를 다 배열로 넣을 수 있다.
 */

public class OOPTest {
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		Member member;
		
		member = new Prof();
		member.name = "김유신";
		member.print();	//오버라이딩했으니 prof꺼
		member.sal();
		list.add(member);
		
		member = new Emp();
		member.name = "홍길동";
		
//		member.print();	//오버라이딩 안했으니 부모클래스인 Member꺼
//		member.sal();
		
		list.add(member);
		
		
		System.out.println("--------------");
		
		for ( Member m :list) {
			m.sal();
			m.print();
			if(m instanceof Emp) {
				//객체간의 형변환은 부모 자식간에만 가능
				((Emp)m).meth(); //()는 캐스팅, 다운캐스팅(형변환)
			}
		}
		
//		for (int i=0; i<list.size(); i++) {
//			Member m = list.get(i);
//			m.sal();
//			m.print();
//		}
		
		//캐스팅
		long a = 10;
		//int b = a; //long>int라서 불가능하다 여기서 캐스팅 쓰면 된다
		int b = (int)a;
	}
}
