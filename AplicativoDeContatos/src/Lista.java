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
        else {
            fim.setProximo(novoNo);
            fim.setAnterior(fim);
            fim = novoNo;
        }
        // novoNo.setContato(contato);
        // novoNo.setAnterior(inicio);
        // setInicio(novoNo);
        tamanho++;
    }


    public void consultarContato(String nome) {

        if(this.tamanho == 0) {
            System.out.println("lista vazia");
            return;
        }

        No noTemp = inicio;
        
        while(noTemp.getProximo() != null) {            
            if(noTemp.getContato().getNome().equals(nome)){
                System.out.println("contato encontrado no while");
                break;
            }
            else {
                noTemp = noTemp.getAnterior();
            }
        }

        if(noTemp.getContato().getNome().equals(nome) && noTemp.getAnterior() == null) {
            System.out.println("contato encontrado:");
        }
        else if(noTemp.getContato().getNome() != nome) {
            System.out.println("contato nao cadatrado");
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
