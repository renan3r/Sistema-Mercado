/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Endereco;
import Utilitarios.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Junim Roberti
 */
public class EnderecoDAO implements InterfaceDAO{

 
 PreparedStatement ps = null;
 ResultSet rs = null;

    
    private String sql;
    private Connection conn;

    @Override
    public void excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int CadastrarEndereco(Endereco endereco){
        
        int temp = 1;
        
        try {
            
            
            sql = "Insert into Endereco (rua, numero, bairro, cidade) values (?,?,?,?)";
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;        
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCidade());                        
            stmt.execute();
        
            
            stmt = conn.prepareStatement("SELECT * FROM ENDERECO");       
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                temp = rs.getInt("CODIGOENDERECO");
                System.out.println(temp);
            }          
     


        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        return temp;        
    }

    @Override
    public ArrayList<Endereco> buscar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList<Endereco> arrayEndereco = new ArrayList<>();
        try {
            
            stmt =  ConexaoBD.conectar().prepareStatement("SELECT * FROM Endereco");
            rs = stmt.executeQuery();
             
            
            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setCodigo(rs.getInt("CODIGOENDERECO"));
                endereco.setRua(rs.getString("RUA"));
                endereco.setNumero(rs.getString("NUMERO"));
                endereco.setBairro(rs.getString("BAIRRO"));
                endereco.setCidade(rs.getString("CIDADE"));
                arrayEndereco.add(endereco);
            }
                       
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayEndereco; 
    }
}
