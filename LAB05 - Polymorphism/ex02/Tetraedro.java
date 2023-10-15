import static java.lang.Math.sqrt;
public class Tetraedro extends Forma{
    public Tetraedro(String nome, double vt1){
        super(nome, vt1, 0,0);
    }

    public double obterArea(){
        return area = (vt1 * vt1) * sqrt(3);
    }

    public double obterVolume(){
        return volume = ((vt1 * vt1 *vt1) * sqrt(2)) / 12;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Área do Tetraedro: " + obterArea() + " cm²");
        System.out.println("Volume do Tetraedro: " + obterVolume() + " cm³");
        System.out.println("\nEssa figura é um tetraedro, uma forma tridimensional.");
    }
}
