package metodos.Ex1;

/**
 *
 * @author _AlyyRazack
 */
public class ContaAPrazo {
    String proprietario;
     double saldo;
    
    
    //metodo  q faz o levantamento
    boolean levantamento(double valor){
        if (this.saldo<valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    //Deposito
    void deposita (double valor){
        this.saldo += valor ;// this.saldo = saldo + valor;
    }
   
    
    
}
