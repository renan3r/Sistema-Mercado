/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.util.ArrayList;
import Modelo.Produto;
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
public class ProdutoDAO implements InterfaceDAO{
    private Connection conn;
    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void excluir(Object obj) {
        try {
            int codigo = (int) obj;
            int codigoEstoque= 0;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT estoque_codigoestoque FROM produto WHERE codigoproduto=" + codigo);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                codigoEstoque = Integer.parseInt(rs.getString("estoque_codigoestoque"));
            }
            stmt = conn.prepareStatement("DELETE FROM produto WHERE codigoproduto=" + codigo);
            stmt.execute();            
            stmt = conn.prepareStatement("DELETE FROM ESTOQUE WHERE codigoestoque=" + codigoEstoque);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<Produto> buscarUm(String nome){
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        try {
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM MERCADOBD.produto WHERE nomeproduto='"+ nome + "'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(rs.getString("codigoproduto")));
                produto.setDataValidade(rs.getString("datavalidade"));
                produto.setModelo(rs.getString("modelo"));
                produto.setNomeProduto(rs.getString("nomeproduto"));
                produto.setPrecoCompra(Float.parseFloat(rs.getString("precocompra")));
                produto.setPrecoVenda(Float.parseFloat(rs.getString("precovenda")));
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("ESTOQUE_CODIGOESTOQUE")));
                produto.setCodigoFornecedor(Integer.parseInt(rs.getString("FORNECEDOR_CODIGOFORNECEDOR")));
                produto.setCodigoNotaFiscal(Integer.parseInt(rs.getString("NOTAFISCAL_CODIGONOTAFISCAL")));
                arrayProduto.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayProduto;
    }
    @Override

 
   public ArrayList<Produto> buscar() {
        ArrayList<Produto> arrayProduto = new ArrayList<>();
        
        try {
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produto");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(rs.getString("codigoproduto")));
                produto.setDataValidade(rs.getString("datavalidade"));
                produto.setModelo(rs.getString("modelo"));
                produto.setNomeProduto(rs.getString("nomeproduto"));
                produto.setPrecoCompra(Float.parseFloat(rs.getString("precocompra")));
                produto.setPrecoVenda(Float.parseFloat(rs.getString("precovenda")));
                produto.setCodigoEstoque(Integer.parseInt(rs.getString("ESTOQUE_CODIGOESTOQUE")));
                produto.setCodigoFornecedor(Integer.parseInt(rs.getString("FORNECEDOR_CODIGOFORNECEDOR")));
                produto.setCodigoNotaFiscal(Integer.parseInt(rs.getString("NOTAFISCAL_CODIGONOTAFISCAL")));
                arrayProduto.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayProduto;
    }
    public void adicionar(Object obj, int codigoEstoque, int codigoNotafiscal, int codigoFornecedor){
        try {
            Produto produto =  (Produto) obj;
            conn = ConexaoBD.conectar();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUTO ( NOTAFISCAL_CODIGONOTAFISCAL, ESTOQUE_CODIGOESTOQUE, FORNECEDOR_CODIGOFORNECEDOR, nomeproduto, modelo, precocompra, precovenda, DATAVALIDADE) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, String.valueOf(codigoNotafiscal));
            stmt.setString(2, String.valueOf(codigoEstoque));
            stmt.setString(3, String.valueOf(codigoFornecedor));
            stmt.setString(4, produto.getNomeProduto());
            stmt.setString(5, produto.getModelo());
            stmt.setFloat(6, produto.getPrecoCompra());
            stmt.setFloat(7, produto.getPrecoVenda());
            stmt.setString(8, produto.getDataValidade());
            stmt.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
            
}
