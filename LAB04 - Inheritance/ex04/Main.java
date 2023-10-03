public class Main{
    public static void main(String args[]){
        C1 c1 = new C1("A", "B", "C");
        c1.mostrarAtributos();
        System.out.println();
        c1.mostrarAtributosSuper();
        System.out.println();

        C2 c2 = new C2(10, 20, 30);
        c2.mostrarAtributos();
        System.out.println();
        c2.mostrarAtributosSuper();
        System.out.println();

        C3 c3 = new C3(80, 90, 100, 50, 60, 70);
        c3.mostrarAtributos();
        System.out.println();
        c3.mostrarAtributosSuper();
    }
}
