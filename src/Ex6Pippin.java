
public class Ex6Pippin extends Thread {
	public Ex6Pippin() {
		
	}
	
	public void run() {
		int contador = 0;
		for (int i=0; i < 30; i++) {
			System.out.print("P");
			contador++;
			if (contador == 30) {
				System.out.println(" Pipin ha arribat");
			}
			try {
				sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
}
