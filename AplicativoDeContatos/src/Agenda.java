
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Agenda {
    
    Scanner scan = new Scanner(System.in);
    boolean proximaInteracao = true;

    int operador = 4;
    Hash hash = new Hash(operador);

    public void menuAgenda() throws ParseException {
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
        "\n"+"| 1 - Adicionar novo contato  |"+
        "\n"+"| 2 - Consultar contato       |"+
        "\n"+"| 3 - Remover contato         |"+
        "\n"+"| 4 - Listar contatos         |"+
        "\n"+"| 9 - Fechar programa         |"+
        "\n"+"-------------------------------"+
        "\n"+"Qual ação deseja realizar agora ?" + 
        "\n"+"Resposta:"
        );
    }

    private void selecionarOperacao(int opcao) throws ParseException{        
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
                SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
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
            case 4:
                System.out.println("\n" + hash);
                break;
            case 9: 
                proximaInteracao = false;
                
                int tempoParaOFim = 0;
                for(int i = 10;i > tempoParaOFim ;i--){
                    limparConsole();
                    maoAberta();
                    System.out.println("O programa se encerrará em: "+ i);
                    aguadarTempo(500);
                    limparConsole();
                    maoFechada();
                    System.out.println("O programa se encerrará em: "+ i);
                    aguadarTempo(500);
                }
                break;  
            default: 
                System.out.println("A opção selecionada não faz parte do menu");
                break;
        }
    }

    public void maoAberta() {
        System.out.println(
            "****************************************************\n" +
            "****************************************************\n" +
            "****************************************************\n" +
            "***********************    *************************\n" +
            "**********************      **    ******************\n" + 
            "****************    **      *      *****************\n" +
            "***************      *      *      **    ***********\n" + 
            "***************      *      *      *      **********\n" +
            "***************      *      *      *      **********\n" +
            "***************      *      *      *      **********\n" +
            "***************      *      *      *      **********\n" +
            "***************      *      *      *      **********\n" +
            "*******     ***                           **********\n" +
            "*******      **                           **********\n" +
            "********      *                           **********\n" +
            "*********                                 **********\n" +
            "**********                                **********\n" +
            "***********                               **********\n" +
            "************                             ***********\n" +
            "*************                           ************\n" +
            "***************                        *************\n" +
            "*****************                    ***************\n" +
            "*******************                *****************\n" +
            "****************************************************\n" +
            "****************************************************\n"                     
        );
    }

    private void maoFechada() {
        System.out.println(
            "****************************************************\n" +
            "****************************************************\n" +
            "****************************************************\n" +
            "****************************************************\n" +
            "****************************************************\n" + 
            "****************************************************\n" +
            "****************************************************\n" + 
            "****************************************************\n" +
            "****************************************************\n" +
            "****************************************************\n" +
            "****************    **     **     **     ***********\n" +
            "***************      *      *      *      **********\n" +
            "*******     ***                           **********\n" +
            "*******      **                           **********\n" +
            "********      *                           **********\n" +
            "*********                                 **********\n" +
            "**********                                **********\n" +
            "***********                               **********\n" +
            "************                             ***********\n" +
            "*************                           ************\n" +
            "***************                        *************\n" +
            "*****************                    ***************\n" +
            "*******************                *****************\n" +
            "****************************************************\n" +
            "****************************************************\n"                     
        );
    }

    private void limparConsole(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
    }

    private int aguadarTempo(int tempoEmSegundos){
        try {
            TimeUnit.MILLISECONDS.sleep(tempoEmSegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return tempoEmSegundos;
    }
}
