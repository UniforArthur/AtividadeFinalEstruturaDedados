public class App {
    public static void main(String[] args) throws Exception {

        Hash hash = new Hash(3);

        hash.adicionar(new Contato("Contato 1", 11, "21/01/2000", "arthur@email.com.br", 11 ));
        hash.adicionar(new Contato("Contato 2", 10, "21/01/2000", "arthur2@email.com.br", 14 ));

        System.out.println(hash);
    }
}
