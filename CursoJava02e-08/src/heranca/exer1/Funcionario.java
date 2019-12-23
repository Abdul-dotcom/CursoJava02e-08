/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca.exer1;

/**
 *
 * @author _AlyyRazack
 */
public class Funcionario {
    private String nome;
    private String codigo;
    private String Cargo;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String codigo, String Cargo, double salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.Cargo = Cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", codigo=" + codigo + ", Cargo=" + Cargo + ", salario=" + salario + '}';
    }
    
    
    
}
