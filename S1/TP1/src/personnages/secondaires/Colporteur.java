package personnages.secondaires;

import personnages.principaux.Commercants;

public class Colporteur extends Commercants {

    public Colporteur(String nom,int argent){
        super(nom,argent);
    }

    public int seFaireExtorquer(){
        perdreArgent((super.getArgent()/2));
        parler("Ce monde est injuste ! ( pas vraiment hehe ...");
        return (getArgent()/2);
    }

}
