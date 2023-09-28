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

    public FigurinhaExtra(Figurinha figurinha){
        super(figurinha.getNome(), figurinha.getDataNas(), figurinha.getAltura(), figurinha.getPeso(), figurinha.getPos(), figurinha.getPais());
        this.categoriaEX = "null";
        this.colorEX = "null";
    }

    //Se trocarmos o protected da Class Figurinha, o método MostrarFigurinhaEX() não funciona, pois ele não consegue herdar os atributos de Figurinha.
    public void mostrarFigurinhaEX(){
        super.mostrarFigurinha();
        System.out.println("Categoria: " + categoriaEX);
        System.out.println("Cor: " + colorEX);
    }
}
