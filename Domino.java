import java.util.Scanner;

public class Domino extends Jeu {
    Joueur [] participants;
    Plateau plateau;
    PieceDomino [] pieces;

    @Override
    public void lancerPartie(){
        System.out.println("-- Partie de Domino --" + "\n");
        // Demander combien de participants jouent :
        System.out.println("Combien de joueurs participent ?");
        Scanner sc = new Scanner(System.in);
        int nbrJ = sc.nextInt();
        Joueur [] j = new Joueur[nbrJ];
        for (int i = 0; i < nbrJ; i++) {
            System.out.println("Quel est le nom du joueur n°" + (i+1) + " ?");
            j[i] = new Joueur();
        }
        this.participants = j;
        Plateau p = new Plateau(20);
        this.plateau = p;
    }

    @Override
    public void afficher() {

    }

    @Override
    public void joueUnTour(Joueur j) {

    }
}
