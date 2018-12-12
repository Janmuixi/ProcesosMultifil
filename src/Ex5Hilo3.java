
public class Ex5Hilo3 extends Thread {
	
	public Ex5Hilo3() {
		
	}
	public void run() {
		int dado = (int) (Math.floor(Math.random() * 6) + 1);
		Ex5Main.setDado3(dado);
		System.out.println("Hilo3= "+dado);
	}
}
