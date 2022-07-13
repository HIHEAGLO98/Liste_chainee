package com.list;

public class Cellule {
    protected int valeur;
    protected Cellule suivant;

    public Cellule(int valeur, Cellule suivant)
    {
        this.valeur = valeur;
        this.suivant = suivant;
    }
    public Cellule(int valeur)
    {
     this.valeur = valeur;
     this.suivant = null;
    }

    public int getValeur() {
        return valeur;
    }

    public Cellule getSuivant() {
        return suivant;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setSuivant(Cellule suivant) {
        this.suivant = suivant;
    }
}
