package fr.rpg.pnj;

public class Personnage extends AbstractCombattant {


    private Classe classe;

    public Personnage(int pointDeVie, int degats, String nom, Classe classe) {
        super(pointDeVie, degats, nom);
        this.classe = classe;
    }

    @Override
    public void attaquer(fr.rpg.interfaces.Combattant adversaire) {
        System.out.printf("%s attaque %s en utilisant %s\n",this.getNom(), adversaire.getNom(),this.classe.getAttaque().getNom());
        adversaire.defendre(this.classe.getAttaque().lancerAttaque(this));
    }
}
