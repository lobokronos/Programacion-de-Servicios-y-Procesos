public class Sumatorio extends Thread {

    private int numero;
    private double resultado;

    public Sumatorio(int numero) {
        this.numero = numero;

    }


    public double sumarImpar() {
        if (numero % 2 == 0) {
            numero = numero - 1;
        }
        double total = 0;
        for (int i = numero; i >= 1; i = i - 2) {
            total += i;
        }
        return total;
    }

    @Override
    public void run(){
        resultado=sumarImpar();

    }

    public double getResultado(){
        return resultado;
    }
}

