package personnages.principaux;

import personnages.Humain;

public class Samurai extends Ronin{

    private String seigneur;

    public Samurai(String nom, String boisson, int argent,String seigneur){
        super(nom,argent,boisson);
        this.seigneur=seigneur;

    }

    public void boire(String boisson){
        super.boire();
    }

}
