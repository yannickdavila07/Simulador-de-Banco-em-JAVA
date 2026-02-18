import java.util.Scanner;


public class Principal {

    void main(String[] args) {

        // Códigos ANSI para cores
        String ANSI_CIANO = "\u001B[36m";
        String ANSI_MAGENTA = "\u001B[35m";
        String ANSI_BRANCO = "\u001B[37m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_VERMELHO = "\u001B[31m";
        String ANSI_VERDE = "\u001B[32m";
        String ANSI_AZUL = "\u001B[34m";



        ContaBancaria minhaconta = new ContaBancaria();
        Scanner leitura = new Scanner(System.in);

        String bemvindo = """ 
                       ************Bem-Vindo ao banco NEXUS***********
                       
                       1 - CRIAR CONTA
                       2- SAIR""";
        System.out.println(ANSI_MAGENTA+ bemvindo+ ANSI_RESET);

        int num = leitura.nextInt();
        minhaconta.setSaldo(2680);


        while (num != 2){

            if(num == 1){
                System.out.println(ANSI_VERDE + "Criando conta..."+ ANSI_RESET);
                break;
            }else if (num != 2 && num != 1){
                System.out.println(ANSI_VERMELHO + "Numero invalido, digite novamente: "+ ANSI_RESET);
                num = leitura.nextInt();
            }
        }

        if(num == 1){
            System.out.println(ANSI_AZUL + "Crie o Nome da Conta: " + ANSI_RESET);
            leitura.nextLine();
            minhaconta.setNomeDoTitular(leitura.nextLine());
            System.out.println(ANSI_VERMELHO +"Crie a Senha da sua Conta: "+ ANSI_RESET);
            minhaconta.setSenha(leitura.nextLine());



            while (num == 1) {
                String login = """
                        
                        -=-=-=-=-=-=-=- Login Banco Nexus -=-=-=-=-=-=-=-
                        
                        """;
                System.out.println(ANSI_AZUL + login + ANSI_RESET);

                System.out.println(ANSI_AZUL + "Nome do Titular: " + ANSI_RESET);
                minhaconta.setConfirmarNome(leitura.nextLine());
                System.out.println(ANSI_VERMELHO + "Senha:" + ANSI_RESET);
                minhaconta.setConfirmarSenha(leitura.nextLine());

                if(minhaconta.getConfirmarNome().equals(minhaconta.getNomeDoTitular())  && minhaconta.getConfirmarSenha().equals(minhaconta.getSenha()) ){
                    break;

                }else{
                    System.out.println(ANSI_VERMELHO + "Nome ou Senha Invalido..." + ANSI_RESET);
                }

            }



            while (num == 1) {
                System.out.println(ANSI_MAGENTA + "            ************Bem-Vindo ao banco NEXUS*********** \n" +
                        "                    \n" +
                        "               Nome:" + ANSI_BRANCO + minhaconta.getNomeDoTitular()+ ANSI_RESET + ANSI_MAGENTA +"    \n" +
                        "                    \n" +
                        "           ______________________________________________________         \n" +
                        "            1 - Verificar Saldo\n" +
                        "            2 - Depositar\n" +
                        "            3 - Transferir\n" +
                        "            4 - Sair" + ANSI_RESET);
                int numero = leitura.nextInt();
                if (numero == 1) {
                    minhaconta.verificarSaldo();
                }else if(numero == 2){
                    minhaconta.depositar();
                }else if (numero == 3){
                    minhaconta.transferir();
                }else if(numero == 4){
                    System.out.println(ANSI_CIANO + "Adeus, Volte Sempre!" + ANSI_RESET);
                    break;
                }else{
                    System.out.println("Numero invalido, digite novamente...");
                }
            }


        }




    }
}
