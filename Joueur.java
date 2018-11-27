import java.util.Scanner;

public class Joueur {
    private String nom;
    private int id;
    private int score;

    public Joueur(String nom, int id){
        // Constructeur basique
        this.nom = nom;
        this.score = 0;
        this.id = id;
    }

    public Joueur(int id){
        // Constructeur avec Scanner
        Scanner sc = new Scanner(System.in);
        this.nom = sc.nextLine();
        this.score = 0;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }
}
