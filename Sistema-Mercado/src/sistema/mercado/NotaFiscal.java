/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.mercado;

/**
 *
 * @author Junim Roberti
 */
public class NotaFiscal {
    private int codigoFiscal;
    private String fornecedor;
    
    public void cadastrarNotaFiscal(){
        
    }

    /**
     * @return the codigoFiscal
     */
    public int getCodigoFiscal() {
        return codigoFiscal;
    }

    /**
     * @param codigoFiscal the codigoFiscal to set
     */
    public void setCodigoFiscal(int codigoFiscal) {
        this.codigoFiscal = codigoFiscal;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
