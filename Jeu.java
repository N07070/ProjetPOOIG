public abstract class Jeu {
    private Plateau plateau;
    private Joueur [] participants;

    public abstract void lancerPartie();
    public abstract void afficher();
    public abstract void joueUnTour(Joueur j);
}
