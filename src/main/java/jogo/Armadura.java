package jogo;

public class Armadura {
    private String nome;
    private int protecao;
     
    public Armadura(String nome, int protecao) {
        this.nome = nome;
        this.protecao = protecao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getProtecao() {
        return protecao;
    }

    public void setProtecao(int protecao) {
        this.protecao = protecao;
    }
}
