import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scanner.nextInt();
        
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        saldo = scanner.nextDouble();

        String saldoFormatado = String.format("R$%.2f", saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
            + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoFormatado 
            + " já está disponível para saque.");

        scanner.close();
    }
}