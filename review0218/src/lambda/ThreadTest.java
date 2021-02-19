package lambda;

public class ThreadTest {
	public static void main(String[] args) {
		//두개의 for 동시 실행시키는 멀티스레드
		
		Thread thread = new Thread(new Thread1());
		thread.start();
		
		//무명클래스
		Thread thread2 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=2000; i<2999; i++) {
					try {
						Thread.sleep(200); //0.2초씩 늦춰줌
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}	
			}});
		thread2.start();
		
		//람다식 - 무명클래스 대신에 쓰는 것이 람다식 (클래스선언과 객체생성 == 무명클래스).매서드 하나뿐
		Thread thread3 = new Thread(
				() -> {
					for(int i=3000; i<3999; i++) {
						try {
							Thread.sleep(200); //0.2초씩 늦춰줌
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(i);
					}	
				}
				);
		thread3.start();
		
		for(int i=1000; i<1999; i++) {
			try {
				Thread.sleep(200); //0.2초씩 늦춰줌
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
