public class Forma {
    protected String nome;

    protected double area;

    protected double volume;

    protected double lr1;

    protected double l2;

    public Forma(String nome, int lr1, int l2){
        this.nome = nome;
        this.lr1 = lr1;
        this.l2 = l2;
    }

    public double obterArea(){
        return area;
    }

    public double obterVolume(){
        return volume;
    }

    public void mostrarInfos(){
        System.out.println("Nome da forma: " + nome);
        System.out.println("Área da forma: " + obterArea());
        System.out.println("Volume da forma: " + obterVolume());
    }
}
