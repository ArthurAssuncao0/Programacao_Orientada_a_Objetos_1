public class Main {
    public static void main(String args[]){
        Bebedouro b1 = new Bebedouro("3", "Bebedouro do 5R-B","100m", "5R-B", new Agua("Gelada", "Ótima"));
        Bebedouro b2 = new Bebedouro("1", "Bebedouro do RU","450m", "5Y", new Agua("Morna", "Média"));
        Aluno e1 = new Aluno();

        e1.setMatricula("12211BCC054");
        e1.setCurso("BCC");

        // Relação entre Bebedouro e Aluno => Associação.
        // O objeto Aluno usa o Bebedouro, mas os dois são independentes.
        System.out.println("Exercício 1: \n");
        System.out.println("Informações do aluno: ");
        e1.printaEstudante();
        e1.beberAgua(b1);
        System.out.println("\nOs objetos são independentes!\n");

        // Relação entre Agua e Bebedouro => Agregação.
        // Se o objeto Agua for destruído, o objeto Bebedouro também será.
        // Mas, se o objeto Bebedouro for destruída, o objeto Agua não deixará de existir.
        System.out.println("Exercício 2: \n");
        System.out.println("Bebedouro: ");
        b1.printaBebedouro();
        System.out.println("\nO objeto Água é independente, já o objeto Bebedouro não é independente!\n");

        //EX03 Relação entre Bebedouro e Localização => Composição.
        //Se a classe Bebedouro for removida, a classe Localização é removida.
        System.out.println("Exercício 3: \n");
        System.out.println("Bebedouro 2: ");
        b2.printaBebedouro();
        System.out.println("\nO objeto parte também é removido!");
    }
}

