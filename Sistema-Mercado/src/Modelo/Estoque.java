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
public class Estoque {
    private String quantidadeTotal;
    private String quantidadeAtual;

    /**
     * @return the quantidadeTotal
     */
    public String getQuantidadeTotal() {
        return quantidadeTotal;
    }

    /**
     * @param quantidadeTotal the quantidadeTotal to set
     */
    public void setQuantidadeTotal(String quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    /**
     * @return the quantidadeAtual
     */
    public String getQuantidadeAtual() {
        return quantidadeAtual;
    }

    /**
     * @param quantidadeAtual the quantidadeAtual to set
     */
    public void setQuantidadeAtual(String quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
}
