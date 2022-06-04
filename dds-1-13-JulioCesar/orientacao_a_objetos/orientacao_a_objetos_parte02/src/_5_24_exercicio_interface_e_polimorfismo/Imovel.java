package _5_24_exercicio_interface_e_polimorfismo;

public class Imovel implements Seguravel {

    private double valorDoImovel;
    private int areaConstruida;

    public Imovel(double valorDoImovel, int areaConstruida) {
        this.valorDoImovel = valorDoImovel;
        this.areaConstruida = areaConstruida;
    }

    public boolean obterDescricao() {
        System.out.println("Imovel com area contruida de " + this.areaConstruida + "m2 e valor de mercado " + this.valorDoImovel);
        return false;
    }

    public double calcularValorDaApolice() {
        double valorApolice = this.valorDoImovel * 0.004;
        valorApolice = valorApolice + (areaConstruida * 0.3);
        return valorApolice;
    }
}
