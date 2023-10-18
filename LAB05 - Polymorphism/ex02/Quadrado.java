public class Quadrado extends Bidimensional{
    public Quadrado(String nome, double vb1){
        super(nome, vb1, 0);
    }

    public double obterArea(){
        return area = vb1 * vb1;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Área do Quadrado: " + obterArea() + " cm²");
        System.out.println("\nEssa figura é um quadrado bidimensional." +
                " Por isso, o volume dessa figura é 0!");
    }
}
