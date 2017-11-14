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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junim Roberti
 */
public class EnderecoDAO implements InterfaceDAO{
    
    private String sql;
    private Connection conn;
    ResultSet rs;

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
    
    public int CadastrarEnderecoFuncionario(Endereco endereco){
        
        int temp = 0;
        
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
            /*
            PreparedStatement ps;
            ps = ConexaoBD.conectar().prepareStatement("SELECT * FROM MERCADOBD.Endereco");       
            rs = ps.executeQuery();
            
            while (rs.last()) {
                String dados = rs.getString("codigoendereco");
                temp = Integer.parseInt(dados);
                
        } */          


        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        return temp;        
    }
}
