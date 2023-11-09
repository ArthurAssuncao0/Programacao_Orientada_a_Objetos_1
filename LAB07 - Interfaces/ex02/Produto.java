public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo){
        this.codigo = codigo;
    }
    public int MenorQue(Classificavel o){
        Produto compara = (Produto) o;

        if(this.codigo < compara.codigo){
            return 0;
        }
        else{
            return 1;
        }
    }

    public void imprime() {
        System.out.println("Código: " + codigo);
    }
}

