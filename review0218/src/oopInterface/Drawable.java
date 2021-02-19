package oopInterface;

//상수와 추상메서드만 가지는게 인터페이스
//인터페이스는 개발표준을 정해줌 : 매서드(기능)
public interface Drawable {
	
	String color = "black";
	void draw();	//기본적으로 void 앞에 public abstract있다 생략된거 인터페이스라서

}