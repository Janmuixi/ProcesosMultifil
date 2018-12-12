
public class Ex5Hilo2 extends Thread{
	
	public Ex5Hilo2() {
		
	}
	public void run() {
		int dado = (int) (Math.floor(Math.random() * 6) + 1);
		Ex5Main.setDado2(dado);
		System.out.println("Hilo2= "+dado);
	}
}
