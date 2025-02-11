public class Cuenta {
    private int saldo;
    Cuenta (int s){
        saldo=s;
    }

    private int getSaldo(){
        return saldo;
    }

    private void restar (int cantidad){
        saldo=saldo-cantidad;
    }

    public synchronized void retirarDinero(int cant,String nom){   //QUITA EL SYNCHRONIZED DE ESTE METODO PARA VER LOS CAMBIOS EN EL FUNCIONAMIENTO
        if(getSaldo()>= cant){
            System.out.println(nom+" : SE VA A RETIRAR SALDO (EL ACTUAL ES: "+getSaldo() +")");
            try{
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }

            restar (cant);

            System.out.println("\t"+nom+" retira => "+cant+" ACTUAL(" +getSaldo()+" )");

        }else{
            System.out.println(nom+ " No se puede retirar dinero, NO HAY SALDO( "+getSaldo()+" )");
        }
        if (getSaldo()<0){
            System.out.println("SALDO NEGATIVO => "+getSaldo());
        }
    }

}
