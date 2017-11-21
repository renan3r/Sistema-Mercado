/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.EnderecoDAO;
import Modelo.Endereco;
import java.util.ArrayList;

/**
 *
 * @author Junim Roberti
 */
public class EnderecoControle {

    public int cadastrarEndereco(Endereco endereco){
        
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        int cod;
        cod = enderecoDAO.CadastrarEndereco(endereco);
        return cod;
    }
    
    public ArrayList  <Endereco> busca(){
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        return enderecoDAO.buscar();
    }

}
