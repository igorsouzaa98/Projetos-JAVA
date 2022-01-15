public class CriarConta {
    public static void main(String[] args) {

    Conta primeiraConta = new Conta(4467, 15786, "Marcos José da Silva", "078.965.562-33");
    primeiraConta.depositar(500);
    primeiraConta.sacar(150);

    Conta segundaConta = new Conta(4467, 85493, "Daniel Henrique de Souza", "781,562,852-12");
    segundaConta.depositar(1000);
    segundaConta.transferir(350, primeiraConta);

    System.out.println("O saldo da conta de Marcos é de " + primeiraConta.getSaldo());
    System.out.println("O saldo da conta de Daniel é de " + segundaConta.getSaldo());
    System.out.println(Conta.getTotal());
    }
}
