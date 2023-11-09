public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public int MenorQue(Classificavel q){
        Servico compara = (Servico) q;

        if(this.preco < compara.preco){
            return 0;
        }
        else{
            return 1;
        }
    }

    public void imprime() {
        System.out.println("Preço: " + preco);
    }
}
