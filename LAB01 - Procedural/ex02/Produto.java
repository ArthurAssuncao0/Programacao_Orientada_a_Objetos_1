import java.util.Scanner;

public class Produto{
    public static void alteraPreco(float[] preco, float porcentagem) {
        if (porcentagem > -100) {
            float aux = 1 + porcentagem / 100;
            for (int i = 0; i < preco.length; i++) {
                preco[i] *= aux;
            }
        }
    }
    public static void main (String[] args){
        Scanner x = new Scanner(System.in);

        String nome[] = new String[4];
        float preco[] = new float[4];
        int qtd[] = new int[4];

        for(int i = 0; i < 4; i++){
            System.out.println("Digite o nome,o preco e a quantidade do produto " + (i + 1) + ":");
            nome[i] = x.next();
            preco[i] = x.nextFloat();
            qtd[i] = x.nextInt();
            System.out.printf("\n");
        }

        System.out.println("Aumentando o preco em 10% do produto 1 e 3...");
        alteraPreco(preco, -10);
        alteraPreco(preco, 10);

        System.out.println("\nReduzindo o preco em 5% do produto 2...");
        alteraPreco(preco, -5);

        System.out.println("\nAlterando o preco do prod. 3...");
        alteraPreco(preco, -110);

        System.out.println("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("Produto: " + nome[i] + "\nPreco: " + preco[i] + "\nEstoque: " + qtd[i] + "\n");
        }
    }
}

