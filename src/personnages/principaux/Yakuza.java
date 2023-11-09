package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {

    private String clan;
    private int reputation;

    public Yakuza (String nom,int argent,String boisson, String clan){
        super(nom,boisson,argent);
        clan=this.clan;
        reputation=this.reputation;
    }



}
