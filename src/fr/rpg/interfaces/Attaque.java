package fr.rpg.interfaces;

public interface Attaque {

    public int lancerAttaque(Combattant lanceur);

    public String getNom();
    public void setNom (String nom);
    public int getDegats();
    public void setDegats(int degats);
}
