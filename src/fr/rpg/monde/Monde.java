package fr.rpg.monde;

import fr.rpg.attaques.AttaqueSpeciale;
import fr.rpg.interfaces.Combattant;
import fr.rpg.attaques.BasicAttaque;
import fr.rpg.pnj.Classe;
import fr.rpg.pnj.Monstre;
import fr.rpg.pnj.Personnage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Monde {

    static Map<Integer, Classe> classes = new HashMap<>();

    public static Personnage personnageFactory() {

        initialiserClasses();

        Scanner scanner = new Scanner(System.in);
        String classe;
        do {
            System.out.println("Choisissez une classe");
            classe = scanner.nextLine();
        }while (getClasse(classe) == null);
        Classe classeJoueur = getClasse(classe);
        Random random = new Random();
        System.out.println("Entrez le nom de votre personnage");
        String nom = scanner.nextLine();



        int pdv = random.nextInt(100) + 50; //Le personnage a entre 50 et 150 hp
        int degat = random.nextInt(10) + 3; // Le personnage a entre 3 et 13 pts de degats
        return new Personnage(pdv, degat, nom, classeJoueur);
    }

    private static void initialiserClasses() {
        Classe mage = new Classe("Mage");
        Classe barbare = new Classe("Barbare");
        Classe voleur = new Classe("Voleur");
        BasicAttaque basicAttaque = new BasicAttaque("Attaque basique", 10);
        AttaqueSpeciale bouleDeFeu = new AttaqueSpeciale("Boule de feu", 10);
        mage.ajouterAttaque(bouleDeFeu);
        mage.ajouterAttaque(basicAttaque);
        barbare.ajouterAttaque(basicAttaque);
        voleur.ajouterAttaque(basicAttaque);
        classes.put(1,mage);
        classes.put(2,barbare);
        classes.put(3,voleur);
    }

    public static Classe getClasse(String nom){
        for (Map.Entry<Integer, Classe> entry : classes.entrySet()
             ) {
            if (entry.getValue().getNom().equals(nom)) {
                return entry.getValue();
            }
        }
        System.out.println("Classe invalide ou inexistante");
        return null;
    }

    public static Monstre monstreFactory() {
        String nom = genererNom();
        Random random = new Random();
        int pdv = random.nextInt(100) + 20; //Le personnage a entre 20 et 100 hp
        int degat = random.nextInt(19) + 1; // Le monstre a entre 1 et 20 pts de degats
        return new Monstre(pdv, degat, nom);
    }

    public static String genererNom() {
        String[] debutNom = {"Chat", "Chien", "Khajit", "Orc", "Elfe", "Fee", "Rampant", "Degueux", "Moufette", "Chouquette"};
        String[] finNom = {" qui pue", " Mechant", " de la mort", " disciple de Cthulhu", " des montagnes", " vraiment vilain", " qui prend son cul pour une trompette"};
        String nom = "";
        Random random = new Random();
        nom += debutNom[random.nextInt(debutNom.length)];
        nom += finNom[random.nextInt(finNom.length)];
        return nom;
    }

    public static void combat(Combattant combattant1, Combattant combattant2) {
        int tour = 1;
        do {
            System.out.println("Tour : " + tour++);
            combattant1.attaquer(combattant2); //Priorité à l'attaquand numéro 1
            System.out.println(combattant2);
            if (combattant2.getPointDeVie() > 0) // Si le deuxieme combattant a encore des pdv, il peut riposter
                combattant2.attaquer(combattant1);
            System.out.println(combattant1);
            System.out.printf("\n ---------------- \n");

        } while (combattant1.getPointDeVie() > 0 && combattant2.getPointDeVie() > 0);

        if (combattant1.getPointDeVie()>0)
            System.out.printf("%s gagne le combat\n", combattant1.getNom());
        else System.out.printf("%s gagne le combat\n",combattant2.getNom());
    }

        public static void afficherMonde () {

        }


    }
