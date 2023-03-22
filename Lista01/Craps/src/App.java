import java.util.Random;

public class App {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        int dado1, dado2, soma;
        int ponto = 0;
        int jogada = 1;
        
        dado1 = rand.nextInt(6) + 1;
        dado2 = rand.nextInt(6) + 1;
        soma = dado1 + dado2;
        
        System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
        
        if (soma == 7 || soma == 11) {
            System.out.println("Você venceu!");
            return;
        } else if (soma == 2 || soma == 3 || soma == 12) {
            System.out.println("Craps! Você perdeu!");
            return;
        } else {
            ponto = soma;
            System.out.println("Ponto: " + ponto);
            System.out.println("Iniciando estágio 2");
        }
        
        while (true) {
            jogada++;
            dado1 = rand.nextInt(6) + 1;
            dado2 = rand.nextInt(6) + 1;
            soma = dado1 + dado2;
            System.out.println("Dado 1: " + dado1 + ", Dado 2: " + dado2);
            if (soma == 7) {
                System.out.println("Jogada " + jogada + ": " + soma);
                System.out.println("Você perdeu :-(");
                return;
            } else if (soma == ponto) {
                System.out.println("Jogada " + jogada + ": " + soma);
                System.out.println("Você ganhou :-)");
                return;
            } else {
                System.out.println("Jogada " + jogada + ": " + soma);
            }
        }
        
    }

}