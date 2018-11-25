import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
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

        // Création des Dominos
        this.pieces = new ArrayList<>();
        this.pieces.add(new PieceDomino(0, 0));
        this.pieces.add(new PieceDomino(0, 1));
        this.pieces.add(new PieceDomino(0, 2));
        this.pieces.add(new PieceDomino(0, 3));
        this.pieces.add(new PieceDomino(0, 4));
        this.pieces.add(new PieceDomino(0, 5));
        this.pieces.add(new PieceDomino(0, 6));
        this.pieces.add(new PieceDomino(1, 1));
        this.pieces.add(new PieceDomino(1, 2));
        this.pieces.add(new PieceDomino(1, 3));
        this.pieces.add(new PieceDomino(1, 4));
        this.pieces.add(new PieceDomino(1, 5));
        this.pieces.add(new PieceDomino(1, 6));
        this.pieces.add(new PieceDomino(2, 2));
        this.pieces.add(new PieceDomino(2, 3));
        this.pieces.add(new PieceDomino(2, 4));
        this.pieces.add(new PieceDomino(2, 5));
        this.pieces.add(new PieceDomino(2, 6));
        this.pieces.add(new PieceDomino(3, 3));
        this.pieces.add(new PieceDomino(3, 4));
        this.pieces.add(new PieceDomino(3, 5));
        this.pieces.add(new PieceDomino(3, 6));
        this.pieces.add(new PieceDomino(4, 4));
        this.pieces.add(new PieceDomino(4, 5));
        this.pieces.add(new PieceDomino(4, 6));
        this.pieces.add(new PieceDomino(5, 5));
        this.pieces.add(new PieceDomino(5, 6));
        this.pieces.add(new PieceDomino(6, 6));

        // Distribution des Dominos
        this.paquet = new ArrayList[participants.length + 1];
        for (int i = 0; i < paquet.length; i++) {
            this.paquet[i] = new ArrayList<>();
        }
        Random rand = new Random();
        int dist;
        if (participants.length == 2){
            dist = 7;
        } else {
            dist = 6;
        }
        for (int i = 1; i < paquet.length; i++) {
            for (int j = 0; j < dist; j++) {
                PieceDomino p = pieces.remove(rand.nextInt(pieces.size()));
                p.setProprio(participants[i-1]);
                this.paquet[i].add(p);
            }
        }
        while(!pieces.isEmpty()){
           this.paquet[0].add(pieces.remove(0));
        }
    }

    public void afficherDominos(){
        for (int i = 1; i < paquet.length; i++) {
            System.out.print( participants[i-1].getNom() + " : ");
            for (int j = 0; j < paquet[i].size(); j++) {
                System.out.print(paquet[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    public void placerDomino(PieceDomino p){
        //
    }

    @Override
    public void joueUnTour(Joueur j) {
        //
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
                if (nbrJ < 2 || nbrJ > 4) {
                    System.err.println("Rentrez un chiffre entre 2 et 4 inclus.");
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
