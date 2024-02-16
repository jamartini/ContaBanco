import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;

        System.out.println("Por favor, digite seu nome: ");
        String nome = scan.next();

        System.out.println("Agora digite o número da sua conta bancária: ");
        int numero = scan.nextInt();

        System.out.println("Digite agora o número da sua agência (com traço): ");
        String agencia = scan.next();

        System.out.println("Olá, " + nome + ", obrigado por ter escolhido o nosso banco, sua agência é " + agencia +
                ", sua conta é " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
