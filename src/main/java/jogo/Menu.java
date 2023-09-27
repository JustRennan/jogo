package jogo;
import java.util.Scanner;

public class Menu {
 
    Scanner teclado = new Scanner(System.in);

    while (executando) {
        System.out.println("Menu");
        System.out.println("1 - Iniciar");
        System.out.println("2 - Opções");
        System.out.println("3 - Sair");
        System.out.print("Digite uma opção:");
        int opc = teclado.nextInt();
    }
        
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
    }
}

