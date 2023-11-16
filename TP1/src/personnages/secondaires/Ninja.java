package personnages.secondaires;

import personnages.principaux.Yakuza;

import java.util.Random;

public class Ninja extends Yakuza {

    private String clanSecret;

    private static final String[] clansNinja = {" of Shadows ", " of Mist ", " of Clouds ", " of Fog ", " of Darkness "};

    public Ninja(String nom,int argent,String boisson, String clan){
        super(nom, argent, boisson, clan);
        this.clanSecret=clan;
    }

    public void direBonjour(){
        super.direBonjour();
        Random r=new Random ();
        int random = r.nextInt(clansNinja.length);
        switch(random){
            case 1 -> clanSecret=clansNinja[0];
            case 2 -> clanSecret=clansNinja[1];
            case 3 -> clanSecret=clansNinja[2];
            case 4 -> clanSecret=clansNinja[3];
            case 5 -> clanSecret=clansNinja[4];

        }
        parler("(mon clan secret est "+getClan()+clanSecret);
    }

}

