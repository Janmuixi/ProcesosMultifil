import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex10Hilo2 extends Thread{
	public void run() {
			
			try {
	
	            File f = new File("mordor.txt");
	
	            BufferedReader b = new BufferedReader(new FileReader(f));
	
	            String readLine = "";
	            int contador = 0;
	            while ((readLine = b.readLine()) != null) {
	            	if (contador%2!=0) {
	            		System.out.println(readLine);
	            	}
	                contador ++;
	                Thread.sleep(100);
	            }
	
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
}
