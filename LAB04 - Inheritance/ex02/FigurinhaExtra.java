public class FigurinhaExtra extends Figurinha{
    private String colorEX;
    private String categoriaEX;

    public void setCategoriaEX(String categoriaEX) {
        this.categoriaEX = categoriaEX;
    }

    public String getCategoriaEX() {
        return categoriaEX;
    }
    public void setColorEX(String colorEX) {
        this.colorEX = colorEX;
    }

    public String getColorEX() {
        return colorEX;
    }

    public FigurinhaExtra(){
        super();
        this.categoriaEX = "null";
        this.colorEX = "null";
    }

    public void mostrarFigurinha(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNas);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Posição: " + pos);
        System.out.println("País: " + pais);
        System.out.println("Categoria: " + categoriaEX);
        System.out.println("Cor: " + colorEX);
    }
}
