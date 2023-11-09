public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    public int MenorQue(Classificavel p){
        Cliente compara = (Cliente) p;

        if(this.nome.compareTo(compara.nome) < 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
    }
}
