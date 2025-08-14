public class NodoArvore {
    private NodoArvore filhoEsquerda;
    private int chave;
    private NodoArvore filhoDireita;

    private NodoArvore(int chave) {
        this.chave = chave;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
    }
    

}
