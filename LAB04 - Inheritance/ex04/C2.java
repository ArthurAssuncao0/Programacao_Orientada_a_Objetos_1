public class C2 extends C1{
    public int b1;
    protected int b2;
    private int b3;

    public int getB3() {
        return b3;
    }

    public C2(){
        b1 = 0;
        b2 = 0;
        b3 = 0;
        System.out.println("Classe C2: chamada do construtor padrão, sem parâmetros");
    }

    public C2(int b1, int b2, int b3){
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        System.out.println("Classe C2: chamada do construtor com parâmetros");
    }

    public void mostrarAtributos(){
        System.out.println("A1: " + a1);
        System.out.println("A2: " + a2);
        System.out.println("A3: " + getA3());
        System.out.println("B1: " + b1);
        System.out.println("B2: " + b2);
        System.out.println("B3: " + b3);
    }

    public void mostrarAtributosSuper(){
        super.mostrarAtributosSuper();
        System.out.println("B1: " + b1);
        System.out.println("B2: " + b2);
        System.out.println("B3: " + b3);
    }
}
