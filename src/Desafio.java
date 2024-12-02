import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Laiane Martins";
        String tipoConta = "Corrente";
        double saldo = 5699.99;
        double valor = 0;
        int op = 0;

        System.out.println("*******************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*******************************");

        String menu = """
                *** MENU ***
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                
                Digite sua opção:
                """;

        Scanner leitura = new Scanner(System.in);

        while(op != 4) {
            System.out.println(menu);
            op = leitura.nextInt();

            switch (op) {
                case 1:
                    System.out.println("O saldo é " + saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor da transferência? ");
                    valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valor;
                        System.out.println("O saldo atualizado é " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Valor recebido: ");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("O saldo atualizado é " + saldo);
                    break;
                case 4:
                    System.out.println("** Fim do programa **");
                    break;
                default:
                    System.out.println("** Opção inválida **");
                    break;
            }

        }
    }
}
