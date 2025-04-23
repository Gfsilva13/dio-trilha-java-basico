package edu.estudo.view;

import java.util.Scanner;

import edu.estudo.control.TransacaoConta;   

public class VisaoUsuario {
        
    public void menuAberturaConta() {
        Scanner scanner = new Scanner(System.in);
           
        //Exibir as mensagens para o nosso usuário
        System.out.println("Olá, seja bem-vindo ao banco!");  
       
        //Obter pelo scanner o valor digitado no terminal  
        System.out.println("Por favor, digite o número da agência:");   
        String agencia = scanner.next();
            
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();
        
        double saldo = 0.0; // Inicializa o saldo como 0.0
        System.out.println("Por favor, digite o saldo:"); 
        try {
            saldo = scanner.nextDouble(); 
        } catch (Exception e) {
            System.out.println("Valor inválido para o saldo. Por favor, insira um número válido, por exemplo: 10,10");
            return; // Encerra o método se o saldo for inválido 
        }
            
        //Criando um objeto da classe Conta
        TransacaoConta abertura = new TransacaoConta();
        abertura.criarConta(agencia, numeroConta, nome, saldo);
    }
}        