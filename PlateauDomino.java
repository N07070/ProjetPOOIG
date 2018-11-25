public class PlateauDomino extends Plateau {

    public PlateauDomino(int hauteur, int longueur){
        super(hauteur, longueur);
        // Création du plateau
        this.setPlateau(new CaseDomino[hauteur][longueur]);
        // Remplissage du plateau avec des cases vides
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < longueur; j++) {
                this.setCase(i, j, new CaseDomino());
            }
        }
    }

    public PlateauDomino(int hauteur){
        this(hauteur, hauteur);
    }

    @Override
    public void afficher(){
        // Affichage de la grille
        System.out.print("      ");
        for (int j = 1; j < longueur + 1; j++) {
            System.out.print("  ");
            if (j < 10){
                System.out.print(" " + j + " ");
            } else {
                System.out.print(" " + j);
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < hauteur; i++) {
            System.out.print("      ");
            for (int j = 0; j < longueur; j++) {
                System.out.print("+-----");
            }
            System.out.println("+");
            if ((i + 1) < 10){
                System.out.print("   " + (i + 1) + "  ");
            } else {
                System.out.print("  " + (i + 1) + "  ");
            }
            for (int j = 0; j < longueur; j++) {
                System.out.print("|  ");
                if (getCase(i, j).estOccupee()){
                    System.out.print(getCase(i, j).getValeur());
                } else {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println("|");
        }
        System.out.print("      ");
        for (int j = 0; j < longueur; j++) {
            System.out.print("+-----");
        }
        System.out.println("+");
    }
}
