
public class Ex5Hilo1 extends Thread {
	
	public Ex5Hilo1() {
			
	}
	public void run() {
		int dado = (int) (Math.floor(Math.random() * 6) + 1);
		Ex5Main.setDado1(dado);
		System.out.println("Hilo1= "+dado);
	}
}
