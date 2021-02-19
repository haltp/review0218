package oopInterface;

public class Rect 
		extends Shape //속성, 매서드
		implements Drawable, Movable { //추상매서드 //부모클래스는 ,안 되지만 인터페이스는 ,로 여러개 가능	
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	public void move() {
		System.out.println("사각형 이동");
		
	}
}
