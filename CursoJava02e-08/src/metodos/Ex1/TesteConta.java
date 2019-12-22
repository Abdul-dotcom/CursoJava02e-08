package metodos.Ex1;

/**
 *
 * @author _AlyyRazack
 */
public class TesteConta {
    public static void main(String[] args) {
        ContaAPrazo conta = new ContaAPrazo();
        conta.definirSaldo(5000);
        System.out.println(conta.toString());
    }
    
}
