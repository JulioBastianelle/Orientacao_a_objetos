package enumeracoes_5_12;

public enum Naipe {
    OURO("Vermelho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho");
    private String cor;
    Naipe(String cor){
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
}
