public class Circulo extends Forma{
    public Circulo(String nome, int lr1){
        super(nome, lr1, 0);
    }

    public double obterArea(){
        return area = lr1 * 3.14;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("\nEssa figura é um círculo." +
                " Por isso, o volume dessa figura será 0!");
    }
}
