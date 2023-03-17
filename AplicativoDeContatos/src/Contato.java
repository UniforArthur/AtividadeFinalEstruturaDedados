public class Contato {
    
    private String nome;
    private int telefone;
    private String dataDeNascimento;
    private String email;
    private int celular;

    Contato(String nome, int telefone, String dataDeNascimento, String email, int celular) {
        setNome(nome);
        setTelefone(telefone);
        setDataDeNascimento(dataDeNascimento);
        setEmail(email);
        setCelular(celular);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + ", dataDeNascimento=" + dataDeNascimento
                + ", email=" + email + ", celular=" + celular + "]";
    }

    
}