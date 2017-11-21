/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.FornecedorDAO;
import Modelo.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author Junim Roberti
 */
public class FornecedorControle {
    
    public void salvar (Fornecedor fornecedor){
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.cadastrarFornecedor(fornecedor);
    }
    
    public ArrayList<Fornecedor> buscar() {
        
        FornecedorDAO fonecedorDAO = new FornecedorDAO();
        return fonecedorDAO.buscar();
    }
    
    public void remover (Object obj){
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.excluir(obj);        
    }
   public void alterar (Object obj){
       FornecedorDAO fornecedorDAO = new FornecedorDAO();
       fornecedorDAO.alterar(obj);
   }
   
}
