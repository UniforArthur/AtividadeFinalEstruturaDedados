import java.text.SimpleDateFormat;
import java.util.Date;

public class Contato {
    
    private String nome;
    private long telefone;
    private Date dataDeNascimento;
    private String email;
    private long celular;

    Contato(String nome, long telefone, Date dataDeNascimento, String email, long celular) {
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

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento2) {
        this.dataDeNascimento = dataDeNascimento2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular2) {
        this.celular = celular2;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "\n(Nome: " + nome + ", Telefone: " + telefone + ", Data de nascimento: " + sdf.format(dataDeNascimento)
                + ", e-mail: " + email + ", Celular: " + celular + ");";
    }
   
}