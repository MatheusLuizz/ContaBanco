import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta +" e seu " +
                "saldo de "+ saldo + " já está disponível para saque");
    }
}