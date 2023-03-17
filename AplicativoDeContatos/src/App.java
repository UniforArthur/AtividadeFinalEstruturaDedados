public class App {
    public static void main(String[] args) throws Exception {

        Hash hash = new Hash(10);

        hash.adicionar(new Contato("Contato 1", 11, "21/01/2000", "arthur@email.com.br", 11 ));
        hash.adicionar(new Contato("Contato 2", 30, "21/01/2000", "arthur2@email.com.br", 30 ));
        hash.adicionar(new Contato("Contato 3", 25, "21/01/2000", "arthur3@email.com.br", 25));
        hash.adicionar(new Contato("Contato 4", 33, "21/01/2000", "arthur4@email.com.br", 33 ));
        hash.adicionar(new Contato("Contato 5", 29, "21/01/2000", "arthur5@email.com.br", 29 ));
        hash.adicionar(new Contato("Contato 6", 41, "21/01/2000", "arthur6@email.com.br", 41 ));


        System.out.println(hash);
    }
}
