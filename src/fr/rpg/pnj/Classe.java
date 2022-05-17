package fr.rpg.pnj;

import fr.rpg.interfaces.Attaque;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Classe {
    private String nom;
    private List<Attaque> attaques;

    public Classe(String nom) {
        this.nom = nom;
        attaques = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Attaque> getAttaques() {
        return attaques;
    }

    public Attaque getAttaque(){
        Random random = new Random();
        return attaques.get(random.nextInt(attaques.size()));
    }

    public void ajouterAttaque(Attaque attaque){
        attaques.add(attaque);
    }
}
