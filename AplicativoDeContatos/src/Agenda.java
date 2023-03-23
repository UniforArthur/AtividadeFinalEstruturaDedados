import java.util.Scanner;

public class Agenda {
    
    Scanner scan = new Scanner(System.in);
    boolean proximaInteracao = true;

    int operador = 4;
    Hash hash = new Hash(operador);

    public void menuAgenda(){
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
        "\n"+"| 1 - Adicionar novo contato. |"+
        "\n"+"| 2 - Consultar contato.      |"+
        "\n"+"| 3 - Remover contato.        |"+
        "\n"+"| 4 - Fechar programa.        |"+
        "\n"+"-------------------------------"+
        "\n"+"Qual ação deseja realizar agora ?" + 
        "\n"+"Resposta:"
        );
    }

    private void selecionarOperacao(int opcao) {        
        switch(opcao) {
            case 1: 
                limparConsole();

                System.out.println("Cadastro");
                System.out.print("Nome: ");
                String nome = scan.next();
                System.out.print("Telefone (DDDNNNNNNNN): ");
                int telefone = scan.nextInt();
                System.out.print("Data de nascimento (DD/MM/AAAA): ");
                String dataNascimento = scan.next();
                System.out.print("E-mail (exemplo@email.com): ");
                String email = scan.next();
                System.out.print("Celular (DDDNNNNNNNNN): ");
                int celular = scan.nextInt();

                hash.adicionar(new Contato(nome,telefone,dataNascimento,email,celular)); 
                break;
            case 2:
                System.out.println("Informe o nome que deseja consultar");
                String resposta = scan.next();
                hash.consultar(resposta);
                break;
            case 3:
                System.out.println("Exluindo um contato");
                break;
            case 4: 
                proximaInteracao = false;
                break;
            case 5:
                System.out.println(hash);
                break;
            default: 
                System.out.println("a opção selecionada não faz parte do menu");
                break;
        }
    }

    private void limparConsole(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
    }
}
