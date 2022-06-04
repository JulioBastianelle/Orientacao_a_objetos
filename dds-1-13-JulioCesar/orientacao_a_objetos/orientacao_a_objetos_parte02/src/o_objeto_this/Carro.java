package o_objeto_this;

public class Carro {
    String fabricante;
    String modelo;
    String  cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    void alterarModelo(String modelo){
        if (modelo != null) {
            this.modelo = modelo;
        }
    }

    void ligar() {
        if (modelo != null) {
            System.out.println("ligando o carro: " + modelo);
        }
    }
}