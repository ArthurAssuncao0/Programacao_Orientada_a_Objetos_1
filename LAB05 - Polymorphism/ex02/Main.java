public class Main {
    public static void main(String args[]){
        Forma[] formas = new Forma[6];

        formas[0] = new Circulo("Círculo-A", 2);
        formas[1] = new Quadrado("Quadrado-A", 4.5);
        formas[2] = new Triangulo("Triangulo-A", 6, 8, 10);
        formas[3] = new Esfera("Esfera-A", 12);
        formas[4] = new Cubo("Cubo-A", 3);
        formas[5] = new Tetraedro("Tetraedro-A", 2);

        System.out.println();
        for(Forma forma : formas){
            forma.mostrarInfos();
            System.out.println("\n");
        }
    }
}
