public class CamaroteSup extends VIP{
    private String location;

    private int valorAddCamSup;

    public CamaroteSup(String location){
        this.location = location;
        valorAddCamSup = super.valorAdd + 50;
    }

    public void imprimeCamSup(){
        System.out.println("Localização: " + location);
        System.out.println("Valor: " + valorAddCamSup);
    }
}
