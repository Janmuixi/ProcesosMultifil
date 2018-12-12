
public class Ex6Sam extends Thread {
	public Ex6Sam() {
		
	}
	
	public void run() {
		int contador = 0;
		for (int i=0; i < 30; i++) {
			System.out.print("S");
			contador++;
			if (contador == 30) {
				System.out.println(" Sam ha arribat");
			}
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
