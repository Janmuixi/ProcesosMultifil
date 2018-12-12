
public class Ex6Frodo extends Thread {
	public Ex6Frodo() {
		
	}
	
	public void run() {
		int contador = 0;
		
		for (int i=0; i < 30; i++) {
			System.out.print("F");
			contador++;
			if (contador == 30) {
				System.out.println(" Frodo ha arribat");
			}
			try {
				sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
