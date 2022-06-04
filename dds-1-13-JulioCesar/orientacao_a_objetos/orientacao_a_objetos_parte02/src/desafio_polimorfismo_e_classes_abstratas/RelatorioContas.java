package desafio_polimorfismo_e_classes_abstratas;

import jdk.swing.interop.SwingInterOpUtils;

public class RelatorioContas {

    public void exibirListagem(Conta[] contas) {
        System.out.println("***************************************");
        System.out.println("RELATÓRIO DE CONTAS A PAGAR RECEBER");
        System.out.println("***************************************");

        for (int i = 0; i < contas.length; i++) {
            contas[i].exibirDetalhes();
        }

        System.out.println();
    }
}
