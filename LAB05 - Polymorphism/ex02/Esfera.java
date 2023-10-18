public class Esfera extends Tridimensional {
    public Esfera(String nome, double vt1){
        super(nome, vt1, 0, 0);
    }

    public double obterArea(){
        return area = 4 * 3.14 * (vt1 * vt1);
    }

    public double obterVolume(){
        return volume = ((double) 4 /3) * 3.14 * (vt1 * vt1 * vt1);
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Área da Esfera: " + obterArea() + " cm²");
        System.out.println("Volume da Esfera: " + obterVolume() + " cm³");
        System.out.println("\nEssa figura é uma esfera, uma forma tridimensional.");
    }
}
