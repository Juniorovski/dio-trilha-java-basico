import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("<======== BEM VINDOS AO BANCO RM DO CURSO JAVA DA ***DIO*** ========>");

    Scanner scan = new Scanner(System.in);

        System.out.println("digite seu nome:");
        String nome = scan.nextLine();
        System.out.println("Digite o numero da conta:");
        int conta = scan.nextInt();
        System.out.println("Digite o numero da sua agencia:");
        int agencia = scan.nextInt();
        System.out.println("Deposite seu saldo:");
        double saldo = scan.nextDouble();
        
        System.out.printf("Olá %s obrigado por abrir uma conta na nosso banco, sua agencia %d, conta %d e seu saldo é: %.2f" , nome,agencia,conta,saldo );
    
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
