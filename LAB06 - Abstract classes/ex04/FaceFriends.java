public class FaceFriends{
    public static void main(String args[]){
        Contato[] contatos = new Contato[4];

        contatos[0] = new Familia("Gege", "Geovana", "Ge@gmaail.com", "08/04/1970", "Mãe");
        contatos[1] = new Amigos("Simba", "Fláio", "Flavindopneu@gmail.com","09/12/2005", 1);
        contatos[2] = new Trabalho("Porpeta", "Eduardo", "Bolota123@yahoo.com", "17/03/1989", "Chefe");
        contatos[3] = new Amigos("Magrin", "Marcelo", "Marcelo45g@gmail.com", "30/01/2008", 2);

        for (Contato contato : contatos) {
            if (contato instanceof Familia) {
                contato.ImprimirContato();
            }
            if (contato instanceof Amigos) {
                contato.ImprimirContato();
            }
            if (contato instanceof Trabalho) {
                contato.ImprimirContato();
            }
            System.out.println();
        }
    }
}
