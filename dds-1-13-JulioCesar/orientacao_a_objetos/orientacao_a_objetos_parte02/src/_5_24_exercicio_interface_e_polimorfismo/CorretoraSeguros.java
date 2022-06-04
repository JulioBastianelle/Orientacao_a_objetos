package _5_24_exercicio_interface_e_polimorfismo;

public class CorretoraSeguros {

    public void fazerPropostaSeguro(Seguravel seguravel){
        System.out.println("=======================================");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("=======================================");
        seguravel.obterDescricao();
        System.out.println("Valor da apolice: " + seguravel.calcularValorApolice());
        System.out.println("=======================================");
    }
}
