/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.ProdutoDAO;
import Modelo.Produto;
import java.util.ArrayList;

/**
 *
 * @author Junim Roberti
 */
public class ProdutoControle {
    public void salvar(Produto produto, int codigoEstoque, int codigoNotafiscal, int codigoFornecedor){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.adicionar(produto, codigoEstoque, codigoNotafiscal, codigoFornecedor);
    }
    public ArrayList<Produto> popular(){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        return produtoDAO.buscar();
    }
    public void remover(Object codigo){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.excluir(codigo);
    }
    public ArrayList<Produto> buscar(String nome){ 
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.buscarUm(nome);
    }
}
