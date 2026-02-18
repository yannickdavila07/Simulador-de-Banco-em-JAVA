import java.util.Scanner;

public class ContaBancaria {


    private String nomeDoTitular;
    private String senha;
    private double saldo;
    private String confirmarNome;
    private String confirmarSenha;

    // Códigos ANSI para cores
    String ANSI_MAGENTA = "\u001B[35m";
    String ANSI_BRANCO = "\u001B[37m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_VERMELHO = "\u001B[31m";
    String ANSI_VERDE = "\u001B[32m";
    String ANSI_AZUL = "\u001B[34m";

    Scanner leitura = new Scanner(System.in);

    public void verificarSaldo(){
        System.out.println(ANSI_AZUL+"O seu saldo atual e de: R$" + saldo + ANSI_RESET);
    }


    public void depositar(){
        System.out.println(ANSI_VERDE + "Coloque o valor que voce deseja depositar: " + ANSI_RESET);
        double valor = leitura.nextDouble();
        saldo += valor;
        System.out.println(ANSI_AZUL+"O seu saldo atual e de: R$" + saldo + ANSI_RESET);

    }

    public void transferir(){
        System.out.println(ANSI_VERMELHO + "Coloque o valor que voce deseja transferir: " + ANSI_RESET);
        double valor = leitura.nextDouble();
        if (valor > saldo){
            System.out.println(ANSI_VERMELHO + "Saldo insuficiente para transferencia..." + ANSI_RESET);
        }else{
            saldo -= valor;
            System.out.println(ANSI_AZUL+"O seu saldo atual e de: R$" + saldo + ANSI_RESET);

        }
    }



    //GETTERS
    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public String getSenha() {
        return senha;
    }

    public String getConfirmarNome() {
        return confirmarNome;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETTERS
    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public void setConfirmarNome(String confirmarNome) {
        this.confirmarNome = confirmarNome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
