/**Esta clase crea un hilo que cuenta del 20 al 30**/
public class Hilo2 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i <= 30; i++) {
            System.out.println("Soy el hilo" + i);

        }
    }
}