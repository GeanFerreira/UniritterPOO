/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enunciado;

/**
 * alu2021110241
 * @author gean
 */
public class Produto {
    private int codigo;
    private String marca;
    private double preco;
    private TipoProduto tipoProduto; 

    public Produto(int codigo, String marca, double preco, TipoProduto tipoProduto) {
        this.codigo = codigo;
        this.marca = marca;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}