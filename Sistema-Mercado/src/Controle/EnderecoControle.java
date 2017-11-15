/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.EnderecoDAO;
import Modelo.Endereco;

/**
 *
 * @author Junim Roberti
 */
public class EnderecoControle {

    public int cadastrarEnderecoFuncionario(Endereco endereco){
        
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        int cod;
        cod = enderecoDAO.CadastrarEnderecoFuncionario(endereco);
        return cod;
    }

}
