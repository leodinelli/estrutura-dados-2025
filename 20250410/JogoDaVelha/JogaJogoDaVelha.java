import java.util.Random;
import java.util.Scanner;

public class JogaJogoDaVelha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean jogarDeNovo = true;

        while (jogarDeNovo) {
            JogoDaVelha jogo = new JogoDaVelha();

            while (jogo.vencedor() == 0) {
                int linha = aleatorio.nextInt(3);   
                int coluna = aleatorio.nextInt(3);

                try {
                    jogo.poePeca(linha, coluna); // tenta jogar
                } catch (Exception e) {
                    // posição ocupada
                }
            }

            // tabuleiro final
            System.out.println("Tabuleiro final:");
            System.out.println(jogo.toString());

        
            int resultado = jogo.vencedor();
            if (resultado == JogoDaVelha.X) {
                System.out.println("Jogador X é o Vencedor, Parabéns!!");
            } else if (resultado == JogoDaVelha.O) {
                System.out.println("Jogador O é o Vencedor, Parabéns!!");
            } else {
                System.out.println("O jogo foi definido por um empate!!");
            }

            // jogar de novo    
            System.out.print("Deseja jogar novamente? (s/n): ");
            String resposta = entrada.next();
            if (!resposta.equalsIgnoreCase("s")) {
                jogarDeNovo = false;
                System.out.println("Obrigado por jogar!");
            }
        }

        entrada.close();
    }
}
