/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.FornecedorDAO;
import Modelo.Fornecedor;

/**
 *
 * @author Junim Roberti
 */
public class FornecedorControle {
    public void salvar (Fornecedor fornecedor){
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.adiciona(fornecedor);
    }
}
