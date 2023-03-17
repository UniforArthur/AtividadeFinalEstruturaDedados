public class No {
    
    private Contato contato;
    private No proximo;
    private No anterior;

    No(){
    }

    No(Contato dado, No proximo, No anterior) {
        setContato(dado);
        setAnterior(anterior);
        setProximo(proximo);
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
}
