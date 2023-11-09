package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom,int argent,String boisson){
        super(nom, boisson, argent);
        honneur=1;
    }

    public void donner(int n,Commercants c){
        c.recevoir(n);
    }
     public void provoquer(Yakuza y){
        if (2*honneur>y.getReputation()){
            gagnerArgent(y.perdreDuel());
            honneur=+1;
            parler("J'ai gagné le duel");
         }
        else {
            y.gagnerDuel();
            honneur = -1;
            parler("J'ai perdu, la haine");
        }
     }

}

