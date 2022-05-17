package fr.rpg.attaques;

import fr.rpg.interfaces.Attaque;
import fr.rpg.interfaces.Combattant;

public class AttaqueSpeciale implements Attaque {

    private String nom;
    private int degats;

    public AttaqueSpeciale(String nom, int degats) {
        this.nom = nom;
        this.degats = degats;
    }


    @Override
    public int lancerAttaque(Combattant lanceur) {
        return this.degats;
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
}
