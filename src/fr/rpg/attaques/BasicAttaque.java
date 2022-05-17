package fr.rpg.attaques;

import fr.rpg.interfaces.Attaque;
import fr.rpg.interfaces.Combattant;

import java.util.Random;

public class BasicAttaque implements Attaque {


    private String nom;
    private int degats;

    public BasicAttaque(String nom, int degats) {
        this.nom = nom;
        this.degats = degats;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int getDegats() {
        return degats;
    }

    @Override
    public void setDegats(int degats) {
        this.degats = degats;
    }

    @Override
    public int lancerAttaque(Combattant lanceur) {
        Random random = new Random();
        if(random.nextInt(101) < 70) // l'attaque a 70% de chance de toucher
            return lanceur.getDegats();
        else {
            System.out.println(getNom() + " echoue l'attaque");
            return 0;
        }
    }


}
