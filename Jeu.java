public abstract class Jeu {
    protected Plateau plateau;
    protected Joueur [] participants;  // Tableau des participants

    public abstract void lancerPartie();
    public abstract void joueUnTour(Joueur j);
    public abstract void setJoueur();
}
