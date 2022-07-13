import com.list.Cellule;
import com.list.Liste;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] tab = {3,13,4,7,0,2,5};

        Liste list = new Liste();

        for(int n : tab)
        {
            list.ajouterCellule(new Cellule(n));
        }

        System.out.println("suppression:");
        list.retirerPremiereOccurence(3);

        System.out.println("ajout au debut de la liste");
        list.ajouterAuDebut(25);
        System.out.println(list);
        System.out.println("Root: "+list.getDebut().getValeur());

         System.out.println( "Liste vide: "+list.estVide());

        System.out.println("Longueur de la chaine: "+list.getLongueur()+" ");
        System.out.println("Valeur trouvée: "+list.contient(10));



    }
}
