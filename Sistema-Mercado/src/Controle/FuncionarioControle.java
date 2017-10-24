/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.FuncionarioDAO;
import JFrame.JfrmMenuCaixa;
import JFrame.JfrmMenuGerente;

/**
 *
 * @author Junim Roberti
 */
public class FuncionarioControle {
   
    public void login (String login,int senha){
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO ();
        int temp =0;
        temp = funcionarioDAO.login(login,senha);
         
               if(temp == 1){
                   JfrmMenuGerente tela =  new JfrmMenuGerente();                   
                   tela.setLocationRelativeTo(null);
                   tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE); 
                   tela.setVisible(true);
                  
               }
               if(temp == 2){
                  JfrmMenuCaixa tela =  new JfrmMenuCaixa();
                  tela.setLocationRelativeTo(null);
                  tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);                  
                  tela.setVisible(true);                 
               }
              
    }
}
