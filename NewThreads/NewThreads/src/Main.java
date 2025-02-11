public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Soy el programa principal");
        Hilo1 h1=new Hilo1();
        Hilo2 h2=new Hilo2();

        h1.start();     //Lanzamos el Hilo 1
        h1.join();

        h2.start();     //Lanzamos el hilo 2
        h2.join();





        System.out.println("Programa terminado");
    }
}