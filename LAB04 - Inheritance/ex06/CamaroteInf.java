public class CamaroteInf extends VIP{
    private String location;

    public CamaroteInf(String location){
        this.location = location;
    }

    public void imprimeCamInf(){
        System.out.println("Localização: " + location);
        System.out.println("Valor: " + super.valorAdd);
    }
}
