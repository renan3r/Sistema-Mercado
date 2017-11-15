/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Fornecedor;
import Utilitarios.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Junim Roberti
 */
public class FornecedorDAO implements InterfaceDAO{
    
    PreparedStatement ps = null;
    
    @Override
    public void adiciona(Object obj) {
      Fornecedor fornecedor = (Fornecedor) obj;
        try {
            ps = ConexaoBD.conectar().prepareStatement("Insert into"
                    + " fornecedor (endereco_codigoendereco,nomefornecedor,cpffornecedor,cnpjfornecedor,telefonefornecedor) values (?,?,?,?,?)");
            
            ps.setInt(1, fornecedor.getCodigo());
            ps.setString(2, fornecedor.getNomeFornecedor());
            ps.setString(3, fornecedor.getCpfFornecedor());
            ps.setString(4, fornecedor.getCnpjFornecedor());
            ps.setString(5, fornecedor.getTelefone());
            

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso", "Mensagem", 1);
          
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Não foi possivel executar o comando SQL", "Erro", 0);
        }
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
    
}
