public class Empresa{
    public static void main(String args[]){
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("Arthur", "10/02/2004", 1);
        funcionarios[1] = new Vendedor("Sandra", "25/04/1969", 15, 0.2,1000);
        funcionarios[2] = new Operario("Osvaldo", "02/01/1971", 20, 70, 50);
        funcionarios[3] = new Horista("Ghael", "14/06/2013", 1, 5, 400);

        for(Funcionario funcionario : funcionarios){
            funcionario.mostrarInfos();
            System.out.println();
        }

        FolhaDePagamento.mostrarFolhaPagamento(funcionarios);
    }
}
