import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da sua agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Quando deseja depositar para seu saldo inicial? ");
        double saldo = scanner.nextDouble();


        //Imprimindo os dados do scanner
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo R$" + saldo + " já está disponível para saque");
        
        System.out.println("Deseja fazer um saque ou depósito? Escreva: saque ou deposito para continuar o processamento");
        String respostaCliente = scanner.next();

        if(respostaCliente.equals("saque")){
            System.out.println("Digite o valor que deseja sacar: ");
            double valorSaque = scanner.nextDouble();

            double novoSaldo = saldo - valorSaque;

            System.out.println("Seu saque de R$" + valorSaque + " foi realizado com sucesso, esse é o seu saldo atual: R$" + novoSaldo +".");
        } else if (respostaCliente.equals("deposito")) {
            System.out.println("Digite o valor que deseja depositar: ");
            double valorDeposito = scanner.nextDouble();

            double novoSaldo = saldo + valorDeposito;

            System.out.println("Seu depósito de R$" + valorDeposito + " foi realizado com sucesso, esse é o seu saldo atual: R$" + novoSaldo +".");
        }
    }    
}

