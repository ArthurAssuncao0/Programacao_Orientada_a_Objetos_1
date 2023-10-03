public class C1{
    public String a1;
    protected String a2;
    private String a3;

    public String getA3() {
        return a3;
    }

    public C1(){
        a1 = "null";
        a2 = "null";
        a3 = "null";
        System.out.println("Classe C1: chamada do construtor padrão, sem parâmetros");
    }

    public C1(String a1, String a2, String a3){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        System.out.println("Classe C1: chamada do construtor com parâmetros");
    }

    public void mostrarAtributos(){
        System.out.println("A1: " + a1);
        System.out.println("A2: " + a2);
        System.out.println("A3: " + a3);
    }

    public void mostrarAtributosSuper(){
        System.out.println("A1: " + a1);
        System.out.println("A2: " + a2);
        System.out.println("A3: " + a3);
    }
}
