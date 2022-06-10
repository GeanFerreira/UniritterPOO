/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enunciado;

import java.util.Vector;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/**
 * alu2021110241
 * @author gean
 */
public class Analise {
    public static void main(String[] args) {
        
        Vector<TipoProduto> tipoProdutos = new Vector<>();
        Vector<Produto> produtos = new Vector<>();
        Vector<Pesquisador> pesquisadores = new Vector<>();
        Vector<Produto> produtosMenorValor = new Vector<>();
        
        Map<Produto, Pesquisador> mapaNomes = new HashMap<>();
        
        tipoProdutos.add(new TipoProduto(1, "Café Solúvel"));
        tipoProdutos.add(new TipoProduto(2, "Açucar"));
        tipoProdutos.add(new TipoProduto(3, "Adoçante"));
        tipoProdutos.add(new TipoProduto(4, "Pão de Queijo"));
        tipoProdutos.add(new TipoProduto(5, "Chocolate"));
        
        produtos.add(new Produto(1, "Zé Moleque", 2.30, tipoProdutos.get(0)));
        produtos.add(new Produto(1, "Gostinho Bom", 3.35, tipoProdutos.get(0)));
        produtos.add(new Produto(1, "Doce Vida", 2.60, tipoProdutos.get(1)));
        produtos.add(new Produto(1, "Coisa Boa", 2.20, tipoProdutos.get(1)));
        produtos.add(new Produto(1, "Engordiet", 4.55, tipoProdutos.get(2)));
        produtos.add(new Produto(1, "ZeroGosto", 3.45, tipoProdutos.get(2)));
        produtos.add(new Produto(1, "Da Vovó", 8.10, tipoProdutos.get(3)));
        produtos.add(new Produto(1, "Queijopão", 8.40, tipoProdutos.get(3)));
        produtos.add(new Produto(1, "ChocoGood", 3.50, tipoProdutos.get(4)));
        produtos.add(new Produto(1, "Kakaw", 2.80, tipoProdutos.get(4)));
        
        
        for(Produto produto : produtos) {
            System.out.println(produto.getCodigo() +
                    " * " + produto.getMarca() +
                    " * " + produto.getPreco() +
                    " * " + produto.getTipoProduto());
            
            for(Produto outroProduto : produtos){
                if(produto.getTipoProduto().getCodigo() == outroProduto.getTipoProduto().getCodigo()
                        && produto.getPreco() < outroProduto.getPreco())
                    produtosMenorValor.add(produto);
            }
            System.out.println(produtosMenorValor);
        }
        
        
        pesquisadores.add(new Pesquisador(1, "Analista1"));
        pesquisadores.add(new Pesquisador(2, "Analista2"));
        pesquisadores.add(new Pesquisador(3, "Analista3"));
        
        
        mapaNomes.put(produtos.get(0), pesquisadores.get(0));
        mapaNomes.put(produtos.get(1), pesquisadores.get(1));
        mapaNomes.put(produtos.get(2), pesquisadores.get(2));
        mapaNomes.put(produtos.get(3), pesquisadores.get(2));
        mapaNomes.put(produtos.get(4), pesquisadores.get(1));
        mapaNomes.put(produtos.get(5), pesquisadores.get(0));
        mapaNomes.put(produtos.get(6), pesquisadores.get(0));
        mapaNomes.put(produtos.get(7), pesquisadores.get(1));
        mapaNomes.put(produtos.get(8), pesquisadores.get(1));
        mapaNomes.put(produtos.get(9), pesquisadores.get(2));
        
        mapaNomes.forEach((produto,pesquisador)->
               System.out.println(
                       "Nome do Produto: " + produto.getMarca()  
                       + " || Nome do Pesquisador: " + pesquisador.getNome() 
                       + " || Nome do tipo do produto: " + produto.getTipoProduto().getNome() 
                       + " || Valor do Produto: " + produto.getPreco() 
                       + " || Existe no conjunto de produtos de menor preço: " + produtosMenorValor.contains(produto)));  
    }  
}