package encapsulamento_e_modificadores_de_acesso_public_e_private;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("Teperatura do ar: " + ar.obterTemperatura() + "°");
    }
}