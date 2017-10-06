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
public class Venda {
    private float somaVenda;
    private String formaPagamento;
    private String itensVenda;
    private String nomeVendedor;
    private int codigoVenda;
    private String data;
    
    public void gerarNotaFiscal(){
        
    }
    public void vender(){
        
    }
    public void cancelarVenda(){
        
    }
    public void cancelarItemProduto(){
        
    }
    public void buscarVenda(){
        
    }

    /**
     * @return the somaVenda
     */
    public float getSomaVenda() {
        return somaVenda;
    }

    /**
     * @param somaVenda the somaVenda to set
     */
    public void setSomaVenda(float somaVenda) {
        this.somaVenda = somaVenda;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the itensVenda
     */
    public String getItensVenda() {
        return itensVenda;
    }

    /**
     * @param itensVenda the itensVenda to set
     */
    public void setItensVenda(String itensVenda) {
        this.itensVenda = itensVenda;
    }

    /**
     * @return the nomeVendedor
     */
    public String getNomeVendedor() {
        return nomeVendedor;
    }

    /**
     * @param nomeVendedor the nomeVendedor to set
     */
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    /**
     * @return the codigoVenda
     */
    public int getCodigoVenda() {
        return codigoVenda;
    }

    /**
     * @param codigoVenda the codigoVenda to set
     */
    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
}
