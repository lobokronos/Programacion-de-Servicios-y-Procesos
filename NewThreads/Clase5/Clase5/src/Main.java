public class Main {
    public static void main(String[] args) {

        Cuenta c=new Cuenta(40);
        SacarDinero h1=new SacarDinero("Pantoja",c);
        SacarDinero h2=new SacarDinero("Paquirrín",c);
        h1.start();
        h2.start();

    }
}


    /**En este ejemplo, vemos como utilizando "Synchronized" en el método retirarDinero de la clase CUENTA, permite acceder a los hilos de forma ordenada (hasta que no termine un hilo de utilizar
     * ese método no entra el siguiente a utilizar el metodo. Se han aplicado en cada retirada de dinero un "Sleep" a cada Thread para que haya espacios de tiempo en cada retirada y se vea mejor.
      */
