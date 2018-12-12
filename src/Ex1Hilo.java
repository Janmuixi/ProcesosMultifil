
public class Ex1Hilo extends Thread {
	public void run() {
		int numeroInicial = 1;
        int numeroFinal = 100;
        for (int i = 1; i <= (numeroFinal - numeroInicial + 1); i++ ) {

            int divisores = 0;
            int numeroActual = 0;
            for (int e = 1; e <= i; e++) {
                numeroActual = e;
                if ( (i % e) == 0) divisores++;
                if (divisores == 2)  {break;}

            }
            if (numeroActual == i && i != 1)  System.out.println (i); //muestre el número si cumplió los requisitos, excepto

        }
	}
}