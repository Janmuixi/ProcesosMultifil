
public class Ex2Main {
	static Ex2Hilo1 hilo1 = new Ex2Hilo1();
	static Ex2Hilo2 hilo2 = new Ex2Hilo2();
	private static int num = 0;
	
	public static int getNum() {
		return num;
	}

	public static void increaseNum() {
		num++;
	}

	public static void main(String[] args) {
		int contador = 0;
		
		while(contador < 50) {
			
			hilo1.run();
			hilo2.run();
			
			contador++;
			
		}
		
	}
}
