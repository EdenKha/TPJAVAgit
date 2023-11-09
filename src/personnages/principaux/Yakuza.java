package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {

    private String clan;
    private int reputation;

    public Yakuza (String nom,int argent,String boisson,String clan){
        super(nom,boisson,argent);
        this.clan=clan;
        reputation=this.reputation;
    }

    public String getClan(){
        return clan;
    }

    public int getReputation(){
        return reputation;
    }

    public void extorquer(Commercants c){
        gagnerArgent(c.getArgent());
        c.seFaireExtroquer();
        parler("J'ai volé de l'argent ");
    }

    public void gagnerDuel(){
        reputation=+1;
        parler("J'ai gagné un duel");
    }

    public int perdreDuel(){
        reputation=-1;
        parler("J'ai perdu mon duel et mes "+ getArgent());
        perdreArgent(getArgent());
        return getArgent();
    }

    public void direBonjour(){
        super.direBonjour();
        parler("Mon clan est "+clan);
    }

}
