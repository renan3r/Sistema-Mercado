/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Junim Roberti
 */
public class Funcionario {
    private int codigoFuncionaro;
    private String nomeFuncionario;
    private String login;
    private String senha;
    private int tipo;
    /**
     * @return the nomeFuncionario
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the codigoFuncionaro
     */
    public int getCodigoFuncionaro() {
        return codigoFuncionaro;
    }

    /**
     * @param codigoFuncionaro the codigoFuncionaro to set
     */
    public void setCodigoFuncionaro(int codigoFuncionaro) {
        this.codigoFuncionaro = codigoFuncionaro;
    }
    
}
