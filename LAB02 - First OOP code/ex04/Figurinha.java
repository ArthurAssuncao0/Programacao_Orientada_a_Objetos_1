public class Figurinha{
    private String nome;
    private String dataNas;
    private double peso;
    private double altura;
    private String pos;
    private String pais;
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDataNas(String dataNas){
        this.dataNas = dataNas;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setPos(String pos){
        this.pos = pos;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void mostrarInformacoes(){
        System.out.println("Nome do Jogador: " + nome);
        System.out.println("Data de Nascimento: " + dataNas);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Posição: " + pos);
        System.out.println("País: " + pais);
        System.out.println();
    }
}

