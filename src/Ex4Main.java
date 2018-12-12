
public class Ex4Main {
	static int valor = 0;
	static Ex4Hilo1 hilo1 = new Ex4Hilo1();
	static Ex4Hilo2 hilo2 = new Ex4Hilo2();
	
	public static int getValor() {
		return valor;
	}



	public static void setValor(int d) {
		Ex4Main.valor = d;
	}



	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			hilo1.run();
			hilo2.run();
		}
	}
}
