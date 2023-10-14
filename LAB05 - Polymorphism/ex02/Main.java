public class Main {
    public static void main(String args[]){
        Forma[] formas = new Forma[6];

        formas[0] = new Circulo("CírculoA", 2);

        for(Forma forma : formas){
            forma.mostrarInfos();
            System.out.println();
        }
    }
}
