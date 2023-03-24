import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Agenda {
    
    Scanner scan = new Scanner(System.in);
    boolean proximaInteracao = true;

    int operador = 4;
    Hash hash = new Hash(operador);

    public void menuAgenda() throws ParseException{
        int opcaoSelecionada = 0;

        while(proximaInteracao) {
            InterfaceMenuAgenda();
            opcaoSelecionada = scan.nextInt();
            selecionarOperacao(opcaoSelecionada);
        }
    }

    private void InterfaceMenuAgenda(){

        System.out.print(
        "\n"+"-------------------------------"+   
        "\n"+"|           AGENDA            |"+
        "\n"+"-------------------------------"+ 
        "\n"+"| 1 - Adicionar novo contato |"+
        "\n"+"| 2 - Consultar contato      |"+
        "\n"+"| 3 - Remover contato        |"+
        "\n"+"| 4 - Listar contatos        |"+
        "\n"+"| 9 - Fechar programa        |"+
        "\n"+"-------------------------------"+
        "\n"+"Qual ação deseja realizar agora ?" + 
        "\n"+"Resposta:"
        );
    }

    private void selecionarOperacao(int opcao) throws ParseException {        
        switch(opcao) {
            case 1: 
                limparConsole();
                System.out.println("Cadastro");
                scan.nextLine();
                System.out.print("Nome: ");
                String nome = scan.nextLine();
                System.out.print("Telefone (DDDNNNNNNNN): ");
                long telefone = scan.nextLong();
                System.out.print("Data de nascimento (DD/MM/AAAA): ");
                String dataNascString = scan.next();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date dataNascimento = df.parse(dataNascString);
                System.out.print("E-mail (exemplo@email.com): ");
                String email = scan.next();
                System.out.print("Celular (DDDNNNNNNNNN): ");
                long celular = scan.nextLong();
                hash.adicionar(new Contato(nome,telefone,dataNascimento,email,celular)); 
                break;
            case 2:
                System.out.println("Informe o nome que deseja consultar");
                String resposta = scan.next();
                hash.consultar(resposta);
                break;
            case 3:
                scan.nextLine();
                System.out.print("Digite o nome do contato a ser excluido: ");
                String exclusao = scan.nextLine();
                hash.excluir(exclusao);
                break;
            case 9: 
                proximaInteracao = false;
                break;
            case 4:
                System.out.println("\n" + hash);
                break;
            default: 
                System.out.println("A opção selecionada não faz parte do menu");
                break;
        }
    }
    private void limparConsole(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
    }
}
