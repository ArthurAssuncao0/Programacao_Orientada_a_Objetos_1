import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        Figurinha[] figurinhas = new Figurinha[3];
        FigurinhaExtra[] figurinhasExtra = new FigurinhaExtra[2];

        for(int i = 0; i < 3; i++){
            figurinhas[i] = new Figurinha();

            figurinhas[i].setNome(x.nextLine());
            figurinhas[i].setDataNas(x.nextLine());
            figurinhas[i].setAltura(x.nextDouble());
            figurinhas[i].setPeso(x.nextDouble());
            x.nextLine(); //Limpeza do buffer de entrada
            figurinhas[i].setPos(x.nextLine());
            figurinhas[i].setPais(x.nextLine());
            System.out.println();
        }

        for(int i = 0; i < 2; i++){
            figurinhasExtra[i] = new FigurinhaExtra();

            figurinhasExtra[i].setNome(x.nextLine());
            figurinhasExtra[i].setDataNas(x.nextLine());
            figurinhasExtra[i].setAltura(x.nextDouble());
            figurinhasExtra[i].setPeso(x.nextDouble());
            x.nextLine(); //Limpeza do buffer de entrada
            figurinhasExtra[i].setPos(x.nextLine());
            figurinhasExtra[i].setPais(x.nextLine());
            figurinhasExtra[i].setCategoriaEX(x.nextLine());
            figurinhasExtra[i].setColorEX(x.nextLine());
            System.out.println();
        }

        for(int i = 0; i < 3; i++){
            figurinhas[i].mostrarFigurinha();
            System.out.println();
        }

        for(int i = 0; i < 2; i++) {
            figurinhasExtra[i].mostrarFigurinha();
            System.out.println();
        }
    }
}
