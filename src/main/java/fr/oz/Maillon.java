package fr.oz;

public class Maillon {
    int valeur;
    Maillon maillonSuivant;

    public Maillon(int valeur) {
        this.valeur = valeur;
        this.maillonSuivant = null;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Maillon getMaillonSuivant() {
        return maillonSuivant;
    }

    public void setMaillonSuivant(Maillon maillonSuivant) {
        this.maillonSuivant = maillonSuivant;
    }

}
