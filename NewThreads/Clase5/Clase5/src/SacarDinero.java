public class SacarDinero extends Thread{
    private Cuenta c;
    public SacarDinero (String n, Cuenta c){
        super(n);
        this.c=c;
    }

    public void run(){
        for (int x=1; x<= 4; x++){
            c.retirarDinero(10,getName());
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
