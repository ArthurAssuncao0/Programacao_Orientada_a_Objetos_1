public class Circulo extends Forma{
    public Circulo(String nome, double vt1){
        super(nome, vt1, 0, 0);
    }

    public double obterArea(){
        return area = vt1 * 3.14;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Área do Círculo: " + obterArea() + " cm²");
        System.out.println("\nEssa figura é um círculo bidimensional." +
                " Por isso, o volume dessa figura é 0!");
    }
}
