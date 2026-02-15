# Simulador-de-Banco-em-JAVA
Estou muito feliz em aprender a linguagem java e já evolui muito, criei esse Simulador de Banco para treinar laços e ciclos de repetição. Java é uma linguagem que eu sempre sonhei em aprender.


import java.util.Scanner;

public class DESAFIOS {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        int num = 0;
        double saldo = 2500;
        String dadosDoCliente = """
                    *********************************************************************
                    Dados iniciais do cliente:
                    
                    Nome: Yannick Davila Parreira
                    Tipo conta: Corrente
                    Saldo inicial: R$ 2500,00
                    *********************************************************************""";
        System.out.println(dadosDoCliente);
        while(num != 4){
            String operacoes = """
                    
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair""";
            System.out.println(operacoes);
            num = leitura.nextInt();
            if (num == 1){
                System.out.println(String.format("O seu saldo atual é de R$%.2f", saldo));
            }else if (num == 2){
                System.out.println("Informe o valor a receber: ");
                double acrecimo = leitura.nextInt();
                saldo += acrecimo;
                System.out.println(String.format("Saldo atualizado para R$ %.2f", saldo));
            }else if (num == 3){
                System.out.println("Informe o valor que deseja transferir: ");
                double transferencia = leitura.nextDouble();
                if (transferencia > saldo){
                    System.out.println("Não há saldo suficiente para fazer essa transferência");

                }else{
                    saldo -= transferencia;
                    System.out.println(String.format("Saldo atualizado para R$ %.2f", saldo));
                }
            }else{
                System.out.println("Opção Inválida");
            }
        }
    }
}
