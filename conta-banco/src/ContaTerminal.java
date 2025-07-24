import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, informe o nome do cliente!");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, informe sua agencia!");
            String agencia = scanner.nextLine();
   
            System.out.println("Por favor, informe o numero da conta!");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, informe o saldo inicial da conta!");
            double saldo = scanner.nextDouble();        
                        
            String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numeroConta))
                .concat(" e seu saldo ")
                .concat(String.format("%.2f", saldo))
                .concat(" já está disponível para saque.");
   
            System.out.println(mensagem);
        }    
    }
}
