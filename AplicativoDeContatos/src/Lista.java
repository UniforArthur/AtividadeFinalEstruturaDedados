public class Lista {
    
    private No inicio;
    private int tamanho;

    public void adicionarContato(Contato contato) {
        No novoNo = new No();

        novoNo.setContato(contato);
        novoNo.setAnterior(inicio);
        setInicio(novoNo);
        tamanho++;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {

        No noS = getInicio();
        String saida = null;

        while (noS != null) {
            saida = noS.getContato() + "";
            noS = noS.getProximo();
        }

        return saida;
    }
}
