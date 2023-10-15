import static java.lang.Math.sqrt;

public class Triangulo extends Forma{
    public Triangulo(String nome, double vt1, double vt2, double vt3){
        super(nome, vt1, vt2, vt3);
    }

    public double obterArea(){
        double x = (vt1 + vt2 + vt3) / 2;
        return area = sqrt(x * (x - vt1) * (x - vt2) * (x - vt3));
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Área do Triângulo: " + obterArea() + " cm²");
        System.out.println("\nEssa figura é um triângulo bidimensional." +
                " Por isso, o volume dessa figura é 0!");
    }
}
