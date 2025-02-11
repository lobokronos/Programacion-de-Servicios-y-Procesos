/**Esta clase crea un hilo que cuenta del 0 al 10**/
public class Hilo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Soy el hilo" +i);

        }
    }
}
