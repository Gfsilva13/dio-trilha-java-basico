package edu.estudo.control;

import edu.estudo.model.Conta;

public class TransacaoConta {

    private String agencia;
    private int numero;         
    private String nomeCliente;
    private double saldo;
    
    public void criarConta(String agencia, int numero, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo; // Corrigido para parseDouble
        // Criando um objeto da classe Conta        
        Conta contaNova = new Conta(agencia, numero, nomeCliente, saldo);
        contaNova.mensagemContaCriada();
    }
}