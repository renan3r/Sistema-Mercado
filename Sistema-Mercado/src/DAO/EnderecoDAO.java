/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Endereco;
import Utilitarios.ConexaoBD;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    


 public int adiciona1(Object obj) {
        int temp=0;
        Endereco endereco = (Endereco) obj;
        try {
            ps = ConexaoBD.conectar().prepareStatement("Insert into"
                    + " endereco (rua,numero,bairro,cidade) values (?,?,?,?)");
            
          
            ps.setString(1, endereco.getRua());
            ps.setString(2, endereco.getNumero());
            ps.setString(3, endereco.getBairro());
            ps.setString(4, endereco.getCidade());          

            ps.executeUpdate();
            
            ps = ConexaoBD.conectar().prepareStatement("SELECT * FROM MERCADOBD.endereco where codigoendereco" );
            rs = ps.executeQuery();
            while (rs.last()) {
                
                String dados = rs.getString("codigoendereco");
                temp = Integer.parseInt(dados);
                
            }
            
            JOptionPane.showMessageDialog(null, "Endereço cadastrado com sucesso", "Mensagem", 1);
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Não foi possivel executar o comando SQL", "Erro", 0);
        }
        return temp;
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

    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int CadastrarEnderecoFuncionario(Endereco endereco){
        
        int temp = 1;
        
        try {
            ResultSet rs;
            
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
}
