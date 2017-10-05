/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junim Roberti
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    public Connection conn;
    public void conexao(){
        try{
            System.setProperty("jdbc.Drivers", "org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MercadoBD", "MercadoBD", "bdlps");
           //JOptionPane.showMessageDialog(null, "Conectado!");
        }catch(SQLException ex){
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro!" + ex.getMessage());
        }
    }
    public void desconecta(){
        try{
            conn.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro!" + ex.getMessage());
        }
    }
}
