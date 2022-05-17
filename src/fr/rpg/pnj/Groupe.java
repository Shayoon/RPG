package fr.rpg.pnj;

import fr.rpg.interfaces.Combattant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Groupe implements Combattant {

    private List<Combattant> groupe;

    public Groupe() {
        groupe = new ArrayList<>();
    }


    public void addCombattant(Combattant combattant){
        groupe.add(combattant);
    }

    public boolean estMort(){
        for (Combattant combattant: groupe
             ) {
            if (combattant.getPointDeVie()>0)
                return false;
        }
        return true;
    }

    @Override
    public void attaquer(Combattant adversaire) {
        Random random = new Random();
        Combattant attaquant = groupe.get(random.nextInt(groupe.size()));
        System.out.printf("%s attaque %s\n",attaquant.getNom(), adversaire.getNom());
        adversaire.defendre(attaquant.getDegats());
    }
}
