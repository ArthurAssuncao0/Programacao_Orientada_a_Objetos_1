public class Forma {
    protected String nome;

    protected double area;

    public Forma(String nome){
        this.nome = nome;
    }

    public double obterArea(){
        return area;
    }

    public void mostrarInfos(){
        System.out.println("Nome da forma: " + nome);
    }
}
