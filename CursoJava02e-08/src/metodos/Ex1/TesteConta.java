package metodos.Ex1;

/**
 *
 * @author _AlyyRazack
 */
public class TesteConta {
    public static void main(String[] args) {
        ContaAPrazo conta = new ContaAPrazo();
        conta.proprietario = "bbbb";
        conta.saldo = 500;
        
        //veriificando saldo atual
        System.out.println("O saldo atual e de "+conta.saldo);
        //Leavantamento
        conta.levantamento(250);
        System.out.println(conta.saldo);
        // deposito
        conta.deposita(100);
        System.out.println(conta.saldo);
    }
    
}
