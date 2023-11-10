package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercants;
import personnages.principaux.Samurai;
import personnages.principaux.Yakuza;

public class Traitre extends Samurai {

    private int traitrise;

    public Traitre(String nom,int argent, String boisson,String seigneur){
        super(nom,boisson,argent,seigneur);
        this.traitrise=0;
    }


    public void extorquer(Commercants c) {
        if (traitrise < 3) {
            gagnerArgent(c.getArgent());
            c.seFaireExtorquer();
            parler("Pour bibi ces sous ");
        } else {
            parler("Tu as de la chance j'ai déja volé trop de monde ");

        }
    }

    public void direBonjour(){
        super.direBonjour();
        parler("Mon niveau de traitrise est de "+traitrise);
    }

    public void faireLeGentil(Humain h, int argent){
        super.donner(argent, (Commercants) h);
        if( traitrise<(argent%10))
            traitrise=0;
        else
            traitrise-=argent%10;
    }


}
