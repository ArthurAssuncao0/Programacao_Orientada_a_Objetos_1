public class VIP extends Ingresso{
    protected int valorAdd;

    public VIP(Ingresso ingresso){
        valorAdd = ingresso.valor + 30;
    }

    public void imprimeVIP(){
        System.out.println("Ingreso VIP (valor): " + valorAdd);
    }
}
