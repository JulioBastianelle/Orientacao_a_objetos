package encapsulamento_e_modificadores_de_acesso_public_e_private;

public class ArCondicionado {
    private int temperatura;
    public void trocarTemperatura(int temperatura) {
        if (temperatura >= 17 && temperatura <= 25) {
            this.temperatura = temperatura;
        }
    }
    public int obterTemperatura() {
        return temperatura;
    }
}