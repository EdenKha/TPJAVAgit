package personnages.principaux;

import personnages.Humain;

public class Commercants extends Humain {

    public Commercants(String nom, int argent){
        super(nom,"Thé",argent);
    }

    public int seFaireExtroquer(){
        perdentArgent(super.getArgent());
        parler("Ce monde est injuste !");
        return getArgent();
    }

    public void recevoir(int argent){
        gagnerArgent(argent);
    }

}
