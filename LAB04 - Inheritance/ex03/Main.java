import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        Figurinha[] figurinhas = new Figurinha[3];
        FigurinhaExtra[] figurinhasExtra = new FigurinhaExtra[2];

        for(int i = 0; i < 3; i++){
            figurinhas[i] = new Figurinha("Roberto", "20/05/69", 1,60, "meia", "Brasil");
        }

        for(int i = 0; i < 2; i++){
            figurinhasExtra[i] = new FigurinhaExtra(figurinhas[i]);

            figurinhasExtra[i].setCategoriaEX(x.nextLine());
            figurinhasExtra[i].setColorEX(x.nextLine());
            System.out.println();
        }

        for(int i = 0; i < 3; i++){
            figurinhas[i].mostrarFigurinha();
            System.out.println();
        }

        for(int i = 0; i < 2; i++) {
            figurinhasExtra[i].mostrarFigurinhaEX();
            System.out.println();
        }
    }
}

