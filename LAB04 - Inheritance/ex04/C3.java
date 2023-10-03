public class C3 extends C2{
    public float c1;
    protected float c2;
    private float c3;

    public C3(){
        c1 = 0;
        c2 = 0;
        c3 = 0;
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros");
    }

    public C3(float c1, float c2, float c3, int copy1, int copy2, int copy3){
        super(copy1, copy2, copy3);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        System.out.println("Classe C3: chamada do construtor com parâmetros");
    }

    public void mostrarAtributos(){
        System.out.println("A1: " + a1);
        System.out.println("A2: " + a2);
        System.out.println("A3: " + getA3());
        System.out.println("B1: " + b1);
        System.out.println("B2: " + b2);
        System.out.println("B3: " + getB3());
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        System.out.println("C3: " + c3);
    }

    public void mostrarAtributosSuper(){
        super.mostrarAtributosSuper();
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        System.out.println("C3: " + c3);
    }
}
