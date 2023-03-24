public class Lista {
    
    private No inicio = null;
    private No fim = null;
    private int tamanho = 0;

    public void adicionarContato(Contato contato) {
        No novoNo = new No(contato, null, null);

        if(inicio == null) {
            inicio = novoNo;
            fim = inicio;
        }
        else if (tamanho == 1){
            inicio.setProximo(novoNo);
            novoNo.setAnterior(inicio);
            fim = novoNo;
        }
        else {
            fim.setProximo(novoNo);
            fim.setAnterior(fim);
            fim = novoNo;
        }
        tamanho++;
    }

    public void excluirContato(String nome, int chave){

        No noTemp = inicio;

        while (noTemp != null){
            if(noTemp.getContato().getNome().toUpperCase().equals(nome.toUpperCase())){

                if(noTemp.getAnterior() == null) {
                    inicio = noTemp.getProximo();
                    return;
                }
                else {
                    if(noTemp.getProximo() == null) {
                        noTemp.getAnterior().setProximo(null);
                        return;
                    }
                    else {
                    
                    No excluir = noTemp;
                    noTemp = noTemp.getAnterior();
                    noTemp.setProximo(excluir.getProximo());
                    excluir.getProximo().setAnterior(noTemp);
                    }

                }
                
            }
            else noTemp = noTemp.getProximo();
        }
        System.out.println("O nome indicado não está na lista ");
    }

    public void consultarContato(String nome, int chave) {

        if(this.tamanho == 0) {
            System.out.println("lista vazia");
            return;
        }

        No noTemp = inicio;
        int contador = 1;

        while(noTemp != null) {            
            if(noTemp.getContato().getNome().toUpperCase().equals(nome.toUpperCase())){
                System.out.println("Contato Encontrado! \n");
                System.out.println("Contato: " + noTemp + "\nEncontrado no vetor["+ chave +
                "]" + " na posicao: " + contador);
                return;
            }
                noTemp = noTemp.getProximo();
            
            contador++;
        }
        
        if  (noTemp == null) {
            System.out.println("contato nao cadastrado");
        }

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
        String saida = "";

        while (noS != null) {
            saida += noS.getContato() + "";
            noS = noS.getProximo();
        }

        return saida;
    }
}
