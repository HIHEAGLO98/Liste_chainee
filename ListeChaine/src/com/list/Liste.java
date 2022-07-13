package com.list;


public class Liste {

    private Cellule root;


    public  Liste(){
        this.root = null;

    }

    //c'est bon
    public boolean estVide()
    {
        return  root == null;
    }
    //?cool ca marche........
    public  Cellule getDebut()
    {
        return  this.root;
    }

    //ok......
    public void ajouterAuDebut(int v)
    {
        //on affecte le valeur de root au nouveauNombre
        Cellule nouveauNombre = root;
        root = new Cellule(v,nouveauNombre);
    }

    //Génial
    public int getLongueur()
    {
        int longue = 0;
        //on se met au debut de la liste
        Cellule cel = getDebut();
        while (cel != null)
        {
            longue++;
            cel = cel.getSuivant();
        }
       return longue;
    }

    //cette méthode fonctionne....enfin
    public boolean contient(int v)
    {
        //on declare une variable qui va prendre true  lorsque le nombre cherché est dans la liste
        boolean t = false;

        //on se positionne au premier rang de la liste
        Cellule premierRang = root;
        //tant que t= true et premierRang est non null
        while (!t  && premierRang != null)
        {
            //lorsque le premierRang == v t prend true
            if(premierRang.getValeur() == v)
            {
                t = true;
            }
            else
            {
                premierRang = premierRang.getSuivant();

            }
        }
        return t;
    }

    public void retirerPremiereOccurence(int v)
    {
        if(estVide())
        {
            return;
        }

        Cellule tampon = this.root;
        Cellule next = tampon;
        while (tampon.getSuivant() != null)
        {
            if(tampon.getValeur() == v){
                next.getSuivant().setValeur(tampon.getSuivant().getValeur());
                next.getSuivant().setSuivant(tampon.getSuivant().getSuivant());
                break;
            }
            next = tampon;
            tampon = tampon.getSuivant();
        }
        if(tampon.getSuivant()== null && tampon.getValeur()==v){
            next.setSuivant(null);
        }

    }


    public void concatener(Liste l)
    {
        //tout d'abord on devrait verifier voir si la liste n'est pas vide
        if(estVide())
        {
            this.root = l.root;
        }else {
            //on parcours la liste
            Cellule elementDernier = this.getDebut();
            while (elementDernier.getSuivant()!= null)
            {
                elementDernier = elementDernier.getSuivant();

            }
            //arrivee a la fin, on ajoute les valeurs de la liste passe en parametre
            elementDernier.setSuivant(l.getDebut());

        }

    }

    public  void  ajouterCellule(Cellule cellule)
    {
        if(estVide())
        {
            this.root = cellule;
        }else
        {
            if(this.root.getValeur() > cellule.getValeur()){
                cellule.setSuivant(this.root);
                this.root = cellule;
            }else{
                Cellule tampon = this.root;
                while (tampon.getSuivant()!= null){
                    if(tampon.getValeur()<= cellule.getValeur() &&
                            cellule.getValeur()<tampon.getSuivant().getValeur()){
                        cellule.setSuivant(tampon.getSuivant());
                        break;
                    }
                    tampon = tampon.getSuivant();
                }
                tampon.setSuivant(cellule);
            }
        }
    }

    @Override
   public String toString(){
        Cellule tampon = this.root;
        StringBuilder liste = new StringBuilder();
        int j=1;
        while (tampon.getSuivant()!= null)
        {
            liste.append("Cellule ").append(j).append(": ").append(tampon.getValeur()).append(" \n ");
            tampon = tampon.getSuivant();
            j++;
        }
        liste.append("Cellule ").append(j).append(": ").append(tampon.getValeur()).append("\n ");

        return liste.toString();
   }
}
