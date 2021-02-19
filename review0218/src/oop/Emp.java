package oop;

public class Emp extends Member{
	
	String dept;
	String ho; //호봉

	@Override
	public void sal() { //추상메서드는 반드시 오버라이딩해야한다
		System.out.println("직원급여");
		
	}

	@Override
	public void print() {
		System.out.println("직원");
	}
	
	public void meth() {
		System.out.println("자재관리");
	}
	
	
}
