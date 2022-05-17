package fr.rpg.pnj;

import java.util.Random;

public class Monstre extends AbstractCombattant {

    public Monstre(int pointDeVie, int degats, String nom) {
        super(pointDeVie, degats, nom);
    }


    public void attaquer(fr.rpg.interfaces.Combattant adversaire) {
        System.out.printf("%s attaque %s\n",this.getNom(), adversaire.getNom());
        Random random = new Random();
        if(random.nextInt(101) < 70) // l'attaque a 70% de chance de toucher
            adversaire.defendre(getDegats());
        else {
            System.out.println(getNom() + " echoue l'attaque");
        }
    }
}
