package chapter_8.com.casadocodigo.livraria.teste;

import chapter_8.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}
