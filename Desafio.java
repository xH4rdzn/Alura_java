import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    String nome = "Igor Coelho";
    String tipoConta = "Corrente";
    double saldo = 1599.99;
    double transferindo;
    int opcao;
    Scanner entrada = new Scanner(System.in);

    do {
      System.out.println("**************************");
      System.out.println("\n Nome do Cliente: " + nome + "\n Tipo de Conta: " + tipoConta + "\n Saldo: R$ " + saldo);
      System.out.println("\n**************************");

      System.out.println("\n Operaçoes\n 1- Consultar Saldo\n 2 - Receber Valor\n 3- Transferir Valor\n 4- Sair\n");
      System.out.println("Digte a opção desejada: ");
      opcao = entrada.nextInt();
      switch (opcao){
        case 1:
          System.out.println("Seu saldo atual é de: R$ " + saldo);
          continue;
        case 2:
          System.out.println("Informe o valor que irá receber: ");
          saldo += entrada.nextDouble();
          System.out.println("Seu saldo atualizado é de: R$ " + saldo);
          continue;
        case 3:
          System.out.println("Informe o valor que irá transferir: ");
          transferindo = entrada.nextDouble();
          if (saldo < transferindo) {
            System.out.println("Saldo insuficiente para realizar essa transferencia !");
            continue;
          } else {
            saldo -= transferindo;
            System.out.println("Transferencia realizada com sucesso ! Seu saldo atual é de: R$ " + saldo);
            continue;
          }
        case 4:
          System.out.println("Encerrando programa...");
          break;
        default:
          System.out.println("Opçao Invalida. Tente Novamente !");
      }
    } while (opcao != 4);

  }

}