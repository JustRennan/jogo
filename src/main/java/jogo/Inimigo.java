package jogo;

public class Inimigo {
    private String nome;
    private Arma arma;
    private int vida;

    public Inimigo(String nome,int vida){
        this.nome = nome;
        this.vida = vida;
    }
    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public Arma getArma() {
        return arma;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public void receberDano(int dano) {
        this.vida -= dano;
        System.out.printf("%s recebeu dano de %d (Vida: %d)%n",
                this.getNome(), dano, this.getVida());
    }
    public void atacar(Personagem outro) {
        if (arma == null) {
            System.out.printf("%s atacou %s com a mão%n",
                    this.getNome(), outro.getNome());
            outro.receberDano(1);
            return;
        }

        System.out.printf("%s atacou %s com %s%n",
                this.getNome(), outro.getNome(), arma.getNome());
        outro.receberDano(arma.getDano());
    }
    public void recuperarVida(Pocao pocao) {
        this.setVida(this.getVida() + pocao.getCura());
        System.out.printf("%s tomou %s e recuperou %d pontos de vida.%n",
                this.getNome(), pocao.getNome(), pocao.getCura());
    }
}
