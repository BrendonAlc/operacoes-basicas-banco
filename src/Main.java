
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente brendon = new Cliente();
        brendon.setNome("Brendon");

        Conta cc = new ContaCorrente(brendon);

        Conta cp = new ContaPoupanca(brendon);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirInformacoesComuns();
        cp.imprimirExtrato();
    }
}