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
public class Fornecedor {
    private String nomeFornecedor;
    private String cpfFornecedor;
    private String cnpjFornecedor;
    private String telefone;
    private int codigoForncedor;
    /**
     * @return the nomeFornecedor
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * @param nomeFornecedor the nomeFornecedor to set
     */
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    /**
     * @return the cpfFornecedor
     */
    public String getCpfFornecedor() {
        return cpfFornecedor;
    }

    /**
     * @param cpfFornecedor the cpfFornecedor to set
     */
    public void setCpfFornecedor(String cpfFornecedor) {
        this.cpfFornecedor = cpfFornecedor;
    }

    /**
     * @return the cnpjFornecedor
     */
    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    /**
     * @param cnpjFornecedor the cnpjFornecedor to set
     */
    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }
    
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the codigoForncedor
     */
    public int getCodigoForncedor() {
        return codigoForncedor;
    }

    /**
     * @param codigoForncedor the codigoForncedor to set
     */
    public void setCodigoForncedor(int codigoForncedor) {
        this.codigoForncedor = codigoForncedor;
    }
    
}
