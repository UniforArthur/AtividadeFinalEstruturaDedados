public class No {
    
    private Contato contato;
    private No proximo;
    private No anterior;

    No(){
    }

    No(Contato dado, No proximo, No anterior) {
        this.contato = dado;
        this.anterior = anterior;
        this.proximo = proximo;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    // public String toString() {
    //     return "[contato=" + contato.getNome() + ", proximo=" + proximo + ", anterior=" + anterior + "]";
    // }    
    public String toString() {
            return contato.toString();
        }    
    
}
