import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String NomeCliente;
        float saldo;

        Scanner scanner = new Scanner(System.in);

        // Ler o número da conta
        System.out.print("Digite o número da sua conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        // Ler a agência
        System.out.print("Digite a agência: ");
        agencia = scanner.nextLine();

        // Ler o nome do cliente
        System.out.print("Digite o nome do cliente: ");
        NomeCliente = scanner.nextLine();

        // Ler o saldo
        System.out.print("Digite o saldo: ");
        saldo = scanner.nextFloat();

        // Exibir os dados da conta
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + NomeCliente);
        System.out.println("Saldo: " + saldo);

        System.out.println("Olá cliente " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + "conta "+numero+ "e seu saldo "+ saldo+ "já está disponível para saque");
        scanner.close();
    }
}
