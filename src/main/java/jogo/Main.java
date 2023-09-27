package jogo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Personagem cavaleiro = new Personagem("Cavaleiro");
        Inimigo mantis = new Inimigo("Mantis", 60);
        Inimigo tecela = new Inimigo("Tecelã", 80);
        Inimigo quebrado = new Inimigo("Receptaculo Quebrado", 120); 
        Inimigo hornet = new Inimigo("Hornet", 100);
        Inimigo pale  = new Inimigo("Cavaleiro Palido", 180);
        Arma ferrao = new Arma("Ferrão", 50);
        Arma agulha = new Arma("Agulha", 40);
        Arma ferrao_lin = new Arma("Ferrão linha", 60);
        Arma mandibula = new Arma("Mandibula", 40);
        Arma garras = new Arma("Garras", 25);
        Arma ferrao_puro = new Arma("Ferrão Puro", 80);
        Armadura manto = new Armadura("Manto de Mariposa", 20);
        Armadura vazio = new Armadura("Capsula do vazio", 40);
        Pocao fragmento = new Pocao("Fragmento de Alma", 10, 25);
        Pocao alma = new Pocao("Alma", 10, 50);
        Pocao sangue = new Pocao("Sangue Vital", 30, 10);
        Pocao bencao = new Pocao("Benção de Joni", 100, 10);

        cavaleiro.setArma(ferrao);
        mantis.setArma(garras);
        quebrado.setArma(agulha);
        pale.setArma(ferrao_lin);
        hornet.setArma(ferrao_lin);
        tecela.setArma(mandibula);

        mantis.atacar(cavaleiro);
        cavaleiro.recuperarVida(sangue);
        cavaleiro.atacar(mantis);

        Scanner teclado = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("Menu");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Opções");
            System.out.println("3 - Sair");
            System.out.print("Digite uma opção:");
            int opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Você escolheu Iniciar");
                    break;
                case 2:
                    System.out.println("Você escolheu Opções");
                    break;
                case 3:
                    System.out.println("Você escolheu Sair");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        double randNum = Math.random(); 
        if (randNum < 0.35) {
            System.out.println("Encontrou um inimigo");
        }
        if (randNum >= 0.35 && randNum <= 0.80) {
            System.out.println("Não encontrou nada");
        }
        if (randNum > 0.80 && randNum <= 0.90) {
            System.out.println("Encontrou um item");
        }
        if (randNum < 0.90) {
            System.out.println("Encontrou uma poção");
        }
        System.out.println(randNum);
        }
    }
}
