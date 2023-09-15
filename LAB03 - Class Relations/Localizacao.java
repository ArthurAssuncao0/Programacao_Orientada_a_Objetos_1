public class Localizacao{
    private String Distancia;
    private String Bloco;
    public String getDistancia(){
        return Distancia;
    }
    public void setDistancia (String distancia){
        Distancia = distancia;
    }
    public String getBloco(){
        return Bloco;
    }
    public void setBloco (String bloco){
        Bloco=bloco;
    }
    public Localizacao(String Distancia, String Bloco){
        setDistancia(Distancia);
        setBloco(Bloco);
    }
    public void printaLocal(){
        System.out.printf("Bloco: %s\n", getBloco());
        System.out.printf("Distância: %s\n", getDistancia());
    }
}

