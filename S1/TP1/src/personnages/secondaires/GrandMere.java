package personnages.secondaires;

import personnages.Humain;

import java.util.Random;

public class GrandMere extends Humain {
    private int nbConnaissances ;
    private Random r ;

    private Humain [] memoire = new Humain [30];

    public GrandMere(String nom){
        super(nom,"Tisane",0);
    }

    private String humainHasard(){
        int nmbrerandom=r.nextInt(7);
        switch (nmbrerandom){
            case 0:
                return "Commercant";
            case 1:
                return "Ronin";
            case 2:
                return "Samourai";
            case 3:
                return "Traitre";
            case 4:
                return "Colporteur";
            case 5:
                return "Yakuza";
            case 6:
                return "Ninja";
            default:
                return "Inconnu";
        }

    }

    public void ragoter(){
       for (Humain humain : memoire) {
           if (humain instanceof Traitre){
               parler("Je sais que"+humain.getNom()+"est un Traitre");
           }
           else {
               parler("Je crois que"+humain+"est un "+humainHasard());
           }
       }
    }

    public void faireConnaissance(Humain h){
        if (nbConnaissances<30){
            memoire[nbConnaissances+1]=h;
        }
        else parler("Ma mémoire est pleine !");
    }





}
