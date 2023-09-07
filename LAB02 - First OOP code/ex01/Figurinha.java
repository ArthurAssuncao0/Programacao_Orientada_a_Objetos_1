public class Figurinha{
    private String nome;
    private String dataNas;
    private double peso;
    private double altura;
    private String pos;
    private String pais;

    public Figurinha(String nome, String dataNas, double altura, double peso, String pos, String pais) {
        this.nome = nome;
        this.dataNas = dataNas;
        this.altura = altura;
        this.peso = peso;
        this.pos = pos;
        this.pais = pais;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do Jogador: " + nome);
        System.out.println("Data de Nascimento: " + dataNas);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Posição: " + pos);
        System.out.println("País: " + pais);
        System.out.println();
    }
}
