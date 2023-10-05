import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        CamaroteInf camaroteInf = new CamaroteInf("A-1");
        CamaroteSup camaroteSup = new CamaroteSup("B-2");

        camaroteSup.escreveValor(20);
        camaroteInf.escreveValor(20);

        camaroteSup.imprimeVIP();
        camaroteInf.imprimeVIP();

        System.out.println();


    }
}
