import java.util.Scanner;

public class Joueur {
    private String nom;
    private int score;

    public Joueur(String nom){
        // Constructeur basique.
        this.nom = nom;
        this.score = 0;
    }

    public Joueur(){
        // Constructeur avec Scanner.
        Scanner sc = new Scanner(System.in);
        this.nom = sc.nextLine();
        this.score = 0;
    }

    public String getNom() {
        return nom;
    }
}
