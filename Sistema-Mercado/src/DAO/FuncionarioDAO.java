/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utilitarios.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junim Roberti
 */
public class FuncionarioDAO implements InterfaceDAO{

    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar(Object obj) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    PreparedStatement ps2 = null;
    ResultSet rs = null;
    
    public int login(String login, int senha){
        int temp=0;
         try {
           ps2 = ConexaoBD.conectar().prepareStatement("SELECT * FROM MERCADOBD.Funcionario where Login='" +login+ "' AND senha='" + senha + "'" );
           rs = ps2.executeQuery();
            while (rs.next()) {
                String dados = rs.getString("tipo");
                temp = Integer.parseInt(dados);
            }        
              
            
        } catch (SQLException ex) { 
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return temp;
    }
   
}
