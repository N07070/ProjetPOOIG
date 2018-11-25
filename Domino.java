import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Domino extends Jeu {
    ArrayList<PieceDomino> pieces;      // Toutes les pièces qui existent
    ArrayList<PieceDomino> [] paquet;   // Tableau comportant la pioche et les Dominos non-posés de chaque joeurs
                                        //  -> Taille de paquet = Nombre de joueurs + 1 ([0] correspond à la pioche

    @Override
    public void lancerPartie(){
        System.out.println("-- Partie de Domino --" + "\n");

        // Création des Joueurs
        this.setJoueur();

        // Création du plateau
        this.plateau = new PlateauDomino(20);

        // Création des Dominos (À faire)
        this.pieces = new ArrayList<>();

        // Distribution des Dominos (À faire)
        this.paquet = new ArrayList[participants.length + 1];
        for (int i = 0; i < paquet.length; i++) {
            this.paquet[i] = new ArrayList<>();
        }
    }

    @Override
    public void joueUnTour(Joueur j) {

    }

    @Override
    public void setJoueur() {
        boolean b = true;
        while (b){
            System.out.println("Combien de joueurs participent ?");
            Scanner sc = new Scanner(System.in);
            int nbrJ = 1;
            try {
                nbrJ = sc.nextInt();
                if (nbrJ < 0) {
                    System.err.println("Rentrez un nombre positif.");
                    b = true;
                } else if ( nbrJ > 10){
                    System.err.println("Rentrez un nombre inférieur à 10.");
                    b = true;
                } else {
                    this.participants = new Joueur[nbrJ];
                    b = false;
                }
            } catch (InputMismatchException e){
                System.err.println("Rentrez un nombre valide.");
                b = true;
            }
        }
        for (int i = 0; i < participants.length; i++) {
            System.out.println("Quel est le nom du joueur n°" + (i+1) + " ?");
            participants[i] = new Joueur();
        }
    }
}
