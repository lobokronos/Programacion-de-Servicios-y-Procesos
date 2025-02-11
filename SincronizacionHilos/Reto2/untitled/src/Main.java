public class Main {
    public static void main(String[] args) throws InterruptedException {

        Sumatorio s1=new Sumatorio(23);
        Sumatorio s2=new Sumatorio(13);
        Sumatorio s3=new Sumatorio(15);

        s1.start();
        s2.start();
        s3.start();

        s1.join();
        s2.join();
        s3.join();

        double suma=s1.getResultado() + s2.getResultado() + s3.getResultado();
        double formula= suma/8;

        System.out.println("El resultado es "+formula);
    }
}