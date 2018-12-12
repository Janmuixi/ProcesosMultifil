import java.util.Collections;

public class Ex5Main {
	static Ex5Hilo1 hilo1 = new Ex5Hilo1();
	static Ex5Hilo2 hilo2 = new Ex5Hilo2();
	static Ex5Hilo3 hilo3 = new Ex5Hilo3();
	
	static int dado1 = 0;
	static int dado2 = 0;
	static int dado3 = 0;
	
	public static void setDado1(int dado) {
		Ex5Main.dado1 = dado;
	}
	public static void setDado2(int dado2) {
		Ex5Main.dado2 = dado2;
	}
	public static void setDado3(int dado3) {
		Ex5Main.dado3 = dado3;
	}
	
	public static void main (String[] args) {
		hilo1.run();
		hilo2.run();
		hilo3.run();
		
		int sumaDados = dado1+dado2+dado3;
		System.out.println("suma = "+ sumaDados);
	}
}
