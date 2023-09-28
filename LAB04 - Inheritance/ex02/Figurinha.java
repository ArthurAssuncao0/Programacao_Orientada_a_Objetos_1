public class Figurinha {
    protected String nome;
    protected String dataNas;
    protected double altura;
    protected double peso;
    protected String pos;
    protected String pais;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    public String getDataNas() {
        return dataNas;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getPos() {
        return pos;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public Figurinha() {
        this.nome = "null";
        this.dataNas = "null";
        this.altura = 0;
        this.peso = 0;
        this.pos = "null";
        this.pais = "null";
    }

    public void mostrarFigurinha(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNas);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + pos);
        System.out.println("País: " + pais);
    }
}
