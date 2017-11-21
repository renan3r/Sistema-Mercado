/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.util.ArrayList;
import Modelo.NotaFiscal;
import Utilitarios.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Junim Roberti
 */
public class NotaFiscalDAO implements InterfaceDAO{
    @Override
    public void adiciona(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }

    public Object buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //o change body of generated methods, choose Tools | Templates.
    }
    public int buscar(Object obj){
        try {
            int temp = 0;
            NotaFiscal notaFiscal = (NotaFiscal) obj;
            PreparedStatement stmt = ConexaoBD.conectar().prepareStatement("SELECT * FROM notafiscal WHERE cnpj='" + notaFiscal.getCnpj() + "' AND datacompra='" + notaFiscal.getDataCompra() +"'");
            stmt.executeQuery();
            while(stmt.getResultSet().next()){
                temp = stmt.getResultSet().getInt("CODIGONOTAFISCAL");
            }
            return temp;
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
