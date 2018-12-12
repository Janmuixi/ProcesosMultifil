public class Ex7Main {
   public static void main(String[] args) {
      Producer p1 = new Producer();
      Consumer c1 = new Consumer();
      p1.start();
      c1.start();
   }
}

class Consumer extends Thread {
	public Consumer() {
	}
	Producer producer = new Producer();
	public void run() {
		while(true) {
			producer.run();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Producer extends Thread {
   public Producer() {
   } 
   public void run() {
	  System.out.print("Ole tu ");
      
   }
}