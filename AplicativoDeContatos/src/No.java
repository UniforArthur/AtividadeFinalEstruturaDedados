public class No {
    
    private int dado;
    private int proximo;
    private int anterior;

    No(){
    }

    No(int dado, int proximo, int anterior) {
        setDado(dado);
        setAnterior(anterior);
        setProximo(proximo);
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int getProximo() {
        return proximo;
    }

    public void setProximo(int proximo) {
        this.proximo = proximo;
    }

    public int getAnterior() {
        return anterior;
    }

    public void setAnterior(int anterior) {
        this.anterior = anterior;
    }
}
