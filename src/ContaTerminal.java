import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Locale.setDefault(Locale.US);
         Scanner scanner = new Scanner(System.in);

        System.out.println("_____________________________________ ");
        System.out.println("|                                    | ");
        System.out.println("|        INFORME OS DADOS PARA       | ");
        System.out.println("|          ABRIR A SUA CONTA         | ");
        System.out.println("|           EM NOSSO BANCO           | ");
        System.out.println("|____________________________________| ");
        
        System.out.print("Por favor, digite o número da Agência: ");        
        int numeroAgencia = scanner.nextInt();
        
        System.out.print("Por favor, digite o número da Conta: ");
        scanner.nextLine();
        String numeroConta = scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();
    

        System.out.println("_____________________________________ ");
        System.out.println("|                                    | ");
        System.out.println("|        IFORMAÇÕES DA CONTA         | ");
        System.out.println("|             NO TERMINAL            | ");
        System.out.println("|____________________________________| ");
        
        
        String mensagem = "Olá " + nomeCliente + ", muito OBRIGADO \npor criar uma conta em nosso banco,\nsua agência é " +
        numeroAgencia + ", conta " + numeroConta + " \ne seu saldo R$ " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}