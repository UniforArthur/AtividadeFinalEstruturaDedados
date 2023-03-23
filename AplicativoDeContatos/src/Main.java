public class Main {
    public static void main(String[] args) throws Exception {

        // Agenda agenda = new Agenda();
        
        // agenda.menuAgenda();


        Hash hash = new Hash(3);
        Contato cont1 = new Contato("a",1,"1","1",1);
        Contato cont2 = new Contato("m",2,"2","2",2);
        Contato cont3 = new Contato("r",2,"2","2",2);

        hash.adicionar(cont1);
        hash.adicionar(cont2);
        hash.adicionar(cont3);

        System.out.println(hash);

        hash.consultar("m");

    }
}
