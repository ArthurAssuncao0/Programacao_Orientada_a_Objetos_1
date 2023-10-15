public class Forma {
    protected String nome;

    protected double area;

    protected double volume;

    protected double vt1;

    protected double vt2;

    protected double vt3;

    public Forma(String nome, double vt1, double vt2, double vt3){
        this.nome = nome;
        this.vt1 = vt1;
        this.vt2 = vt2;
        this.vt3 = vt3;
    }

    public double obterArea(){
        return area;
    }

    public double obterVolume(){
        return volume;
    }

    public void mostrarInfos(){
        System.out.println("Nome da forma: " + nome);
    }
}
