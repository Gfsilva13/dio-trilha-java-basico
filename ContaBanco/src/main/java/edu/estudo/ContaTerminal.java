package edu.estudo;

import edu.estudo.view.VisaoUsuario;    
/**
 * Classe principal para criar uma conta bancária
 * 
 * @author Genivaldo
 * @version 1.0
 * @since 2023-10-01
 */

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

         VisaoUsuario visaoUsuario = new VisaoUsuario();
         visaoUsuario.menuAberturaConta();
         
    }
}
