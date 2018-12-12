
public class Ex6Main {
	static Ex6Frodo frodo = new Ex6Frodo();
	static Ex6Sam sam = new Ex6Sam();
	static Ex6Pippin pippin = new Ex6Pippin();
	
	static int pasosFrodo = 0;
	static int pasosSam = 0;
	static int pasosPippin = 0;
	
	public static void main (String[] args) {
		frodo.start();
		sam.start();
		pippin.start();
		
	}
	
	public static void incPasosFrodo() {
		Ex6Main.pasosFrodo++;
	}

	public static void incPasosSam() {
		Ex6Main.pasosSam++;
	}

	public static void incPasosPippin() {
		Ex6Main.pasosPippin++;
	}
}
