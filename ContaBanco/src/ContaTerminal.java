import  java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner c1= new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        var nome = c1.next();
        Scanner c2=new Scanner(System.in);
        System.out.print("Digite o Nome de sua agencia:");
        var agencia = c2.next();
        Scanner c3 = new Scanner(System.in);
        System.out.print("agora o numero de sua conta:");
        var numero =c3.next();
        Scanner c4 = new Scanner(System.in);
        System.out.print("Seu saldo:");
        var saldo=c4.next();
        System.out.print("Ola " +nome+ " obrigado por criar uma conta no nosso banco, sua agencia é " +agencia+ " conta " +numero+ " e seu saldo " +saldo+ " já esta disponivel");

    }
}