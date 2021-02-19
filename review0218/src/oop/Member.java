package oop;

public abstract class Member {

	String name;
	String id;
	
	//getter : read
	//setter : write

	public Member() {
		super();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public abstract void sal(); //추상메서드로 만들기

	public void print() {
		System.out.println(name);
	}

}