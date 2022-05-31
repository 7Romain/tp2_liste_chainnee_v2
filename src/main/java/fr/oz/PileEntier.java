package fr.oz;

import javax.swing.JOptionPane;

public class PileEntier {
    Maillon debutListe = null;

    public void setDebutListe(Maillon debutListe) {
        this.debutListe = debutListe;
    }

    void empiler(int valeur) {
        Maillon maillonActuel = this.debutListe; // commence au début de la liste
        Maillon nouveauMaillon = new Maillon(valeur); // création du nouveau maillon
        if (maillonActuel == null) { // vérifie si le maillon existe
            this.debutListe = nouveauMaillon; // sinon
        } else {
            Maillon maillonCourant = debutListe; // commence au premier maillon
            while (maillonCourant.getMaillonSuivant() != null) { // tant qu'il existe un maillon suivant
                maillonCourant = maillonCourant.getMaillonSuivant(); // le maillon courant devient le maillon Suivant
            }
            maillonCourant.setMaillonSuivant(nouveauMaillon);// attribut la reference du maillon suivant (le nouveau
                                                             // maillon) au maillon courant
        }

    }

    int depiler() {
        Maillon maillonActuel = this.debutListe;// commence au beut de la chaine
        try {
            if (maillonActuel == null) {
                throw new IllegalArgumentException("Il n'y a rien ou plus rien à dépiler"); // test si chaine vide
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Il n'y a rien ou plus rien à dépiler");
        }

        while (maillonActuel.getMaillonSuivant().getMaillonSuivant() != null) {

            maillonActuel = maillonActuel.getMaillonSuivant();
        }
        int maillonEnleve = maillonActuel.getMaillonSuivant().getValeur();
        maillonActuel.setMaillonSuivant(null);
        return maillonEnleve;

    }

    void reinitialiser() {
        setDebutListe(null);

    }

    String afficherPille() {
        Maillon maillonActuelle = this.debutListe;
        String affichage = " ";
        if (maillonActuelle == null) {
            JOptionPane.showMessageDialog(null, "Impossible d'afficher une pile vide", "Pile vide",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        Maillon maillonCourant = this.debutListe;
        while (maillonCourant.maillonSuivant != null) {
            affichage = "\n  | " + String.valueOf(maillonCourant.getValeur()) + " |" + affichage;
            maillonCourant = maillonCourant.maillonSuivant;

        }

        JOptionPane.showMessageDialog(null, "Voici le contenu de la pile : " + affichage, "Ma Pile",
                JOptionPane.INFORMATION_MESSAGE);
        return affichage;
    }
}
