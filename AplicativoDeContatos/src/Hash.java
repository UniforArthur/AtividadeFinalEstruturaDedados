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

    void adicionar(Contato contato) {
        int chave = contato.getCelular() % operador;
        lista[chave].adicionarContato(contato);
    }

    public String toString() {

        String saida = "";
        for(int i = 0 ; i < operador; i++ ) {
            
            saida += i + ": ";
            saida += lista[i % operador] + "\n";
        }

        return saida;
    }
}
