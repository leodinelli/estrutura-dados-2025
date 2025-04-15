public class JogoDaVelha {

    protected static final int X = 1, O = -1;
    protected static final int VAZIO = 0;

    protected int tabuleiro[][] = new int[3][3];
    protected int jogador;

    public JogoDaVelha() {
        limpaTabuleiro();
    }

    public void limpaTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
        jogador = X;
    }

    public void poePeca(int i, int j) {
        if (i < 0 || i > 2 || j < 0 || j > 2) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        if (tabuleiro[i][j] != VAZIO)
            throw new IllegalArgumentException("Posição Ocupada");

        tabuleiro[i][j] = jogador;
        jogador = -jogador;
    }

    public boolean eVencedor(int marca) {
        int tamanho = tabuleiro.length;
    
        // verifica cada linha
        for (int i = 0; i < tamanho; i++) {
            int soma = 0;
            for (int j = 0; j < tamanho; j++) {
                soma += tabuleiro[i][j];
            }
            if (soma == marca * tamanho) {
                return true;
            }
        }
    
        // verifica cada coluna
        for (int j = 0; j < tamanho; j++) {
            int soma = 0;
            for (int i = 0; i < tamanho; i++) {
                soma += tabuleiro[i][j];
            }
            if (soma == marca * tamanho) {
                return true;
            }
        }
    
        // verifica diagonal 1
        int somaDiagonal_1 = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonal_1 += tabuleiro[i][i];
        }
        if (somaDiagonal_1 == marca * tamanho) {
            return true;
        }
    
        // verifica diagonal 2
        int somaDiagonal_2 = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonal_2 += tabuleiro[i][tamanho - 1 - i];
        }
        if (somaDiagonal_2 == marca * tamanho) {
            return true;
        }
    
        
        return false;
    }
    

    public int vencedor() {
        // verifica x 
        if (eVencedor(X)) {
            return X;
        }
    
        // verifica O
        if (eVencedor(O)) {
            return O;
        }
    
        // verifica os espaços vazios do jogo
        int tamanho = tabuleiro.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    return 0; // significa que ainda tem jogadas
                }
            }
        }
    
        // empate deu velha hahaha
        return 2;
    }

    public String toString() {
        String retorno = "";

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (tabuleiro[i][j] == X) {
                    retorno += "X";
                } else if (tabuleiro[i][j] == O) {
                    retorno += "O";
                } else {
                    retorno += " ";
                }

                if (j < 2) {
                    retorno += "|";
                }
            }

            if (i < 2) {
                retorno += "\n-+-+-\n";
            }
        }

        return retorno;
    }

}
