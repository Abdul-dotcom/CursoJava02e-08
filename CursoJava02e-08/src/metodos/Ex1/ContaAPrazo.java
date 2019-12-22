package metodos.Ex1;

/**
 *
 * @author _AlyyRazack
 */
public class ContaAPrazo {
    private String nome;
    private double saldo;

    public ContaAPrazo() {
    }

    public ContaAPrazo(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public  double definirSaldo(double x){
        return saldo;
    }
    public static double levantar(){
        return 0;
    }
    public static double depositar(){
        return 0;
    }

    @Override
    public String toString() {
        return "ContaAPrazo{" + "nome=" + nome + ", saldo=" + saldo + '}';
    }
    
    
}
