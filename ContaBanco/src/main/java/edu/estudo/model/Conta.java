package edu.estudo.model; 

public class Conta {
    private String agencia;
    private int numero;
    private String nomeCliente;
    private double saldo;

    //Construtor padrão
    public Conta(String agencia, int numero, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }   

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }       

    public double getSaldo() {
        return saldo;
    }           

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDados() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    } 

    public void mensagemContaCriada() {
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero + " e seu saldo é R$ "+ saldo + "já está disponível para saque.");
    }     

}    