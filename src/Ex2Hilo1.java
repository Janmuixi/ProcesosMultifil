
public class Ex2Hilo1 extends Thread {
	public Ex2Hilo1() {
		
	}
	
	public void run() {
		
		Ex2Main.increaseNum();
		System.out.println("hilo1- "+Ex2Main.getNum());
	}
}
