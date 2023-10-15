public class Quadrado extends Forma{
    public Quadrado(String nome, double vt1){
        super(nome, vt1, 0,0);
    }

    public double obterArea(){
        return area = vt1 * vt1;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Área do Quadrado: " + obterArea() + " cm²");
        System.out.println("\nEssa figura é um quadrado bidimensional." +
                " Por isso, o volume dessa figura é 0!");
    }
}
