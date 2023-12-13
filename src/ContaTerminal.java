import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner inserirDados = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = inserirDados.nextLine();
        System.out.println("Usuário: ");
        int usuario = inserirDados.nextInt();
        inserirDados.nextLine();
        System.out.println("Nome : ");
        String name = inserirDados.nextLine();
        System.out.println("Saldo : ");
        String saldo = inserirDados.nextLine();

        System.out.println("Olá " + name + ", Obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + usuario + " e seu saldo " + saldo + " já está disponivel para saque");


    }
}