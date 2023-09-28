public class FigurinhaExtra {
    private String nomeEX;
    private String dataNasEX;
    private double alturaEX;
    private double pesoEX;
    private String posEX;
    private String paisEX;
    private String categoriaEX;
    private String colorEX;

    public void setNomeEX(String nomeEX){
        this.nomeEX = nomeEX;
    }
    public String getNomeEX() {
        return nomeEX;
    }

    public void setDataNasEX(String dataNasEX){
        this.dataNasEX = dataNasEX;
    }

    public String getDataNasEX(){
        return dataNasEX;
    }

    public void setAlturaEX(double alturaEX){
        this.alturaEX = alturaEX;
    }

    public double getAlturaEX(){
        return alturaEX;
    }

    public void setPesoEX(double pesoEX){
        this.pesoEX = pesoEX;
    }
    public double getPesoEX(){
        return pesoEX;
    }

    public void setPosEX(String posEX) {
        this.posEX = posEX;
    }

    public String getPosEX() {
        return posEX;
    }

    public void setPaisEX(String paisEX) {
        this.paisEX = paisEX;
    }

    public String getPaisEX() {
        return paisEX;
    }

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
        this.nomeEX = "null";
        this.dataNasEX = "null";
        this.alturaEX = 0;
        this.pesoEX = 0;
        this.posEX = "null";
        this.paisEX = "null";
        this.categoriaEX = "null";
        this.colorEX = "null";
    }

    public void mostrarFigurinha(){
        System.out.println("Nome: " + nomeEX);
        System.out.println("Data de Nascimento: " + dataNasEX);
        System.out.println("Altura: " + alturaEX + " cm");
        System.out.println("Peso: " + pesoEX + " kg");
        System.out.println("Posição: " + posEX);
        System.out.println("País: " + paisEX);
        System.out.println("Categoria: " + categoriaEX);
        System.out.println("Cor: " + colorEX);
    }
}
