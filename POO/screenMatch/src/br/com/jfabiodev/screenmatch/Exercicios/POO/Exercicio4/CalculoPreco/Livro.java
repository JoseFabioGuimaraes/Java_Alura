package br.com.jfabiodev.screenmatch.Exercicios.POO.Exercicio4.CalculoPreco;

public class Livro implements Calculavel{
    private double preco;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.1;
    }
}
