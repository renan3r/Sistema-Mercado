/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Fornecedor;
import Utilitarios.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junim Roberti
 */
public class FornecedorDAO implements InterfaceDAO{
    
    private String sql;
    private Connection conn;
    
   
    public void cadastrarFornecedor (Fornecedor fornecedor) {
       try {
            sql = "Insert into Fornecedor (endereço_codigoendereco, nomefornecedor, cpffornecedor, cnpjfornecedor, telefonefornecedor) values (?,?,?,?,?)";
            conn = ConexaoBD.conectar();
            PreparedStatement stmt;        
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, fornecedor.getCodigo());
            stmt.setString(2, fornecedor.getNomeFornecedor());
            stmt.setString(3, fornecedor.getCpfFornecedor());
            stmt.setString(4, fornecedor.getCnpjFornecedor()); 
            stmt.setString(5, fornecedor.getTelefone());             
            stmt.execute();
         


        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }   
 

 
    @Override
    public void excluir(Object obj) {

        PreparedStatement ps2;
       
        try {
            
            conn = ConexaoBD.conectar();
            
                      
            
            int i = (int) obj, temp=0;
            
            PreparedStatement stmt= conn.prepareStatement("Select endereço_codigoendereco from Fornecedor where codigofornecedor=" +i);         
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
               temp = rs.getInt("endereço_codigoendereco");
               
            } 
            stmt= conn.prepareStatement("Delete from Fornecedor where codigofornecedor = "+i);            
            stmt.execute();
            stmt= conn.prepareStatement("Delete from Endereco where codigoendereco= "+temp);           
            stmt.execute();
           

            //System.out.println("Curso deletado com sucesso!");
           // JOptionPane.showMessageDialog(null, "Fornecedor deletado com sucesso", "Deletar", 1);
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel deletar", "Erro" , 0);
            //System.out.println("Não foi possivel executar o comando SQL");
        }

        //throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void alterar(Object obj) {

        PreparedStatement ps2;
        try {
            
            conn = ConexaoBD.conectar();
            
                      
            
            int i = (int) obj, temp=0;
            
            PreparedStatement stmt= conn.prepareStatement("Select from Fornecedor where codigofornecedor=" +i);         
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
               temp = rs.getInt("");
               
            } 
            
           

            //System.out.println("Curso deletado com sucesso!");
           // JOptionPane.showMessageDialog(null, "Fornecedor deletado com sucesso", "Deletar", 1);
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel deletar", "Erro" , 0);
            //System.out.println("Não foi possivel executar o comando SQL");
        }
    }



  

    @Override
     public ArrayList<Fornecedor> buscar() {
        
        PreparedStatement ps;
        ResultSet rs;         
        ArrayList<Fornecedor> arrayFornecedor = new ArrayList<>();
        
        try {       
            ps =  ConexaoBD.conectar().prepareStatement("SELECT * FROM Fornecedor");
            rs = ps.executeQuery();
             
            
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setCodigo(rs.getInt("CODIGOFORNECEDOR"));
                fornecedor.setCodigoEndereco(rs.getInt("ENDEREÇO_CODIGOENDERECO"));
                fornecedor.setNomeFornecedor(rs.getString("NOMEFORNECEDOR"));
                fornecedor.setCpfFornecedor(rs.getString("CPFFORNECEDOR"));
                fornecedor.setTelefone(rs.getString("TELEFONEFORNECEDOR"));
                arrayFornecedor.add(fornecedor);
            }
                       
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayFornecedor;  
    }

    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

  
 

