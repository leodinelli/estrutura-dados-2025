package br.sp.gov.fatecipi.bd;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Sair";
        int op;
        do {
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    String nome = JOptionPane.showInputDialog("Nome");
                    String cpf = JOptionPane.showInputDialog("CPF");
                    Pessoa pes = new Pessoa(nome, cpf);
                    pes.inserir();
                    
                    break;                    
            }
        } while (op!=2);
    }
}