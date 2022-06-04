package _5_24_exercicio_interface_e_polimorfismo;

public class Carro implements Seguravel {

    private int anoDeFabricacao;
    private double valorDoModelo;
    private String modelo;

    public Carro(int anoDeFabricacao, double valorDoModelo, String modelo) {
        this.anoDeFabricacao = anoDeFabricacao;
        this.valorDoModelo = valorDoModelo;
        this.modelo = modelo;
    }

    public String obterDescricao() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricacao: " + this.anoDeFabricacao);
        System.out.println("Valor do Modelo: " + this.valorDoModelo);
    }

    public double calcularValorApolice() {
        double valorApolice = this.valorDoModelo * 0.05;
        if (anoDeFabricacao < 5000) {
            valorApolice = valorApolice * 0.50;
        }
        return valorApolice;
    }
}


