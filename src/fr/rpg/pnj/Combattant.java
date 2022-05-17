package fr.rpg.pnj;

public abstract class Combattant  implements fr.rpg.interfaces.Combattant {

    private int pointDeVie;
    private int degats;
    private String nom;

    public Combattant(int pointDeVie, int degats, String nom) {
        this.pointDeVie = pointDeVie;
        this.degats = degats;
        this.nom = nom;
    }

    @Override
    public void attaquer(fr.rpg.interfaces.Combattant adversaire) {
        System.out.printf("%s attaque %s\n",this.getNom(), adversaire.getNom());
        adversaire.defendre(this.degats);
    }

    @Override
    public void defendre(int degat) {
        this.pointDeVie -= degat;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "nom:["+ this.nom + "], pointDeVie:[" + this.pointDeVie + "], attaque:["+ degats + "]";
    }
}
