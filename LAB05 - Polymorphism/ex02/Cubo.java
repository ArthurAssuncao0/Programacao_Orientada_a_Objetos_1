public class Cubo extends Forma {
    public Cubo(String nome, double vt1){
        super(nome, vt1, 0, 0);
    }

    public double obterArea() {
        return area = 6 * (vt1 * vt1);
    }

    public double obterVolume() {
        return volume = (vt1 * vt1 * vt1);
    }

    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Área do Cubo: " + obterArea() + " cm²");
        System.out.println("Volume do Cubo: " + obterVolume() + " cm³");
        System.out.println("\nEssa figura é um cubo, uma forma tridimensional.");
    }
}
