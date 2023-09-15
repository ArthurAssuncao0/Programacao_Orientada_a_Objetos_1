public class Agua{
    private String Pressao;

    public String getPressao(){
        return Pressao;
    }
    public void setPressao(String pressao){
        Pressao=pressao;
    }
    private String Temperatura; //boa, média, ruim.
    public String getTemperatura(){
        return Temperatura;
    }
    public void setTemperatura(String temperatura){
        Temperatura=temperatura;
    }
    public Agua(String Temperatura, String Pressao){
        setTemperatura(Temperatura);
        setPressao(Pressao);
    }
    public void printaAgua(){
        System.out.printf("Temperatura: %s\n", getTemperatura());
        System.out.printf("Pressão: %s\n", getPressao());
    }
}
