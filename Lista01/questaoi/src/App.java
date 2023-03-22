import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // double[] valores = new double[10];
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Digite o valor " + (i+1) + ": ");
        //     valores[i] = sc.nextDouble();
        // }
        double[] valores = { 3.2, 5.1, 6.8, 4.5, 7.6, 5.9, 6.3, 4.8, 3.6, 5.4 };
        // double[] valores = { 1.5, 2.2, 3.8, 2.1, 3.9, 2.7, 3.3, 2.6, 1.7, 2.8 };

        double media = 0;
        int length = valores.length;
        for (int i = 0; i < length; i++) {
            media += valores[i];
        }
        media = media / length;
        double desvioPadrao = 0;
        for (int i = 0; i < valores.length; i++) {
            desvioPadrao += (valores[i] - media) * (valores[i] - media);
        }        
        desvioPadrao = Math.sqrt(desvioPadrao / (valores.length - 1));
        if (desvioPadrao > 0.1 * media) {
            System.out.println("multímetro com problemas");
        } else {
            System.out.println("O multímetro funcionando.");
        }
        
        // System.out.println("Valores lidos: ");
        // for (int i = 0; i < valores.length; i++) {
        //     System.out.print(valores[i] + " ");
        // }
        System.out.println("Média: " + media);
        System.out.println("Desvio padrão: " + desvioPadrao);
    }
}