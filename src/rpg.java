import java.util.Scanner;

public class rpg {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int dados = leitor.nextInt();
        int vidaDoJogador = leitor.nextInt();
        int ataqueDoJogador = leitor.nextInt();
        int defesaDoJogador = leitor.nextInt();
        int vidaDoInimigo = leitor.nextInt();
        int ataqueDoInimigo = leitor.nextInt();

        int danoJogador = 0;
        int danoInimigo = 0;

        danoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
        danoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);

        if (danoJogador > 0 && danoInimigo < 0) {
            System.out.println("Jogador sobreviveu e derrotou o inimigo");
        } else if (danoJogador > 0 && danoInimigo > 0) {
            System.out.println("Jogador sobreviveu e não derrotou o inimigo");
        } else {
            System.out.println("Jogador não sobreviveu");
        }
    }
}
