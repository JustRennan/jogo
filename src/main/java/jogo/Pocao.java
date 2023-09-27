package jogo;

public class Pocao {
    private String nome;
    private int cura;
    private int mana;

    public Pocao(String nome, int cura, int mana) {
        this.nome = nome;
        this.cura = cura;
        this.mana = mana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
