package oop;

//교수
public class Prof extends Member {
	
	String dept;

	@Override
	public void sal() { //상속받은 메서드를 재정의 = 오버라이딩
		System.out.println("교수 급여");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();  //super = 부모(Member)를 뜻함
		System.out.println("교수");
	}
	
	
}
