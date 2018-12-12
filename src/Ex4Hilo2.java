import java.util.Scanner;

public class Ex4Hilo2 extends Thread{
	public Ex4Hilo2() {
		
	}
	public void run() {
		System.out.print("Escritor: ");
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		Ex4Main.setValor(valor);
	}
}
