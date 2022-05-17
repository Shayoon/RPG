package fr.rpg.interfaces;

public interface Combattant {
    public void attaquer(Combattant adversaire);
    public void defendre(int degat);

    public String getNom();
    public void setNom(String nom);
    public int getPointDeVie();
    public void setPointDeVie(int pdv);
    public int getDegats();
    public void setDegats(int degats);



}
