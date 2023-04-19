import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Seja Bem-Vindo! \nPor favor, digite o número da Agência.");
        String agencia = scan.next();

        System.out.println("Por favor, digite o número da Conta.");
        int conta = scan.nextInt();

        System.out.println("Por favor, digite seu nome.");
        String nome = scan.next();

        System.out.println("Por favor, digite o saldo.");
        double saldo = scan.nextDouble();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco! \nSua agência é: " + agencia + ", conta: " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}