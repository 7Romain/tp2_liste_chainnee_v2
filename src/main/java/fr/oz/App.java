package fr.oz;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        PileEntier pile = new PileEntier();
        // pile.empiler(2);
        // pile.empiler(5);
        // pile.empiler(3);
        // pile.reinitialiser();
        // System.out.println(pile);
        boolean fin = false;
        int valeur;
        while (!fin) {
            try {
                String reponse = JOptionPane.showInputDialog(null, "Veuillez saisir un nombre.", "Valeur ?",
                        JOptionPane.QUESTION_MESSAGE);
                valeur = Integer.parseInt(reponse);
                if (valeur == 0) {
                    fin = true;
                }
                System.out.println(valeur);
                pile.empiler(valeur);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Attention, veuillez saisir un entier SVP.");
            }

        }

        pile.afficherPille();
    }
}
