import java.util.Scanner;

public class CalculImc {
    public static void main(String args[]) {
        // Entrer le poids
        Scanner poids = new Scanner(System.in);
        System.out.println("Veuillez entrer votre poids : ");

        String poids_user = poids.nextLine();

        // Entrer la taille m.cms
        Scanner scannertaille = new Scanner(System.in);
        System.out.println("Veuillez entrer votre taille m.cms");

        String taille_user = scannertaille.nextLine();

        System.out.println("Vous avez entre " + poids_user + " kgs");
        System.out.println("ainsi que " + taille_user + " m");

        // conversion en double
        double taille_user_double = Double.parseDouble(taille_user);
        double poids_double = Double.parseDouble(poids_user);

        // Calcul IMC
        double taille_carre = Math.pow(taille_user_double,2);
        double imc = poids_double / taille_carre;

        // affiche imc
        System.out.println("IMC");
        System.out.println(imc);
            }
}
