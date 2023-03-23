public class Hash {
    
    int operador;
    Lista[] lista;

    Hash(int operador) {
        this.operador = operador;
        lista = new Lista[operador];

        for(int i = 0; i < operador; i++) {
            lista[i] = new Lista();
        }
    }

    public void adicionar(Contato contato) {
        char nome = contato.getNome().toUpperCase().charAt(0);
        int chave = nome % operador;
        lista[chave].adicionarContato(contato);
    }

    public void consultar(String nome) {
        char incialNome =  nome.toUpperCase().charAt(0);
        int chave = incialNome % operador;
        lista[chave].consultarContato(nome);
    }
    

    public String toString() {

        String saida = "";
        
        for(int i = 0 ; i < operador; i++ ) {
            saida += "Vetor "+ i + ": ";
            saida += lista[i % operador] + "\n";
        }

        return saida;
    }
}
