public abstract class Jeu {
    Plateau plateau;

    public abstract void lancerPartie();
    public abstract void afficher();
    public abstract void joueUnTour(Joueur j);
}
