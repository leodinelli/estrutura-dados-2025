public class TesteJogoDaVelha {
    public static void main(String[] args) {
        
        System.out.println("Jogo da velha:");
        JogoDaVelha jogo = new JogoDaVelha();
        
        /*teste do X vencer  
        jogo.poePeca(0, 0); 
        jogo.poePeca(0, 1); 
        jogo.poePeca(1, 1); 
        jogo.poePeca(0, 2); 
        jogo.poePeca(2, 2); 

        /*teste 0 vencer
        jogo.poePeca(1, 1);
        jogo.poePeca(0, 0);
        jogo.poePeca(1, 2);
        jogo.poePeca(0, 1);
        jogo.poePeca(2, 1);
        jogo.poePeca(0, 2);*/

        //teste empate
        jogo.poePeca(0, 0);
        jogo.poePeca(0, 1);
        jogo.poePeca(1, 1);
        jogo.poePeca(1, 0);
        jogo.poePeca(2, 0);
        jogo.poePeca(2, 2);
        jogo.poePeca(2, 1);
        jogo.poePeca(0, 2);
        jogo.poePeca(1, 2);



        System.out.println(jogo.toString());
        mostrarVencedor(jogo);    }

        //mostrar o vencedor daora
        private static void mostrarVencedor(JogoDaVelha jogo) {
            int resultado = jogo.vencedor();
        if (resultado == JogoDaVelha.X) {
            System.out.println("O jogador X venceu!");
        } else if (resultado == JogoDaVelha.O) {
            System.out.println("O jogador O venceu!");
        } else {
            System.out.println("O jogo terminou em empate!");
        }
    }
}