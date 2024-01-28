package personnages;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class Humain {
    private String nom;
    private String boisson;
    private int argent;

    public Humain(String nom, String boisson, int argent) {
        this.nom = nom;
        this.boisson = boisson;
        this.argent = argent;
    }

    protected void parler (String texte){
        System.out.println(nom+ "-" +texte);
    }

    public void direBonjour(){
        parler("Bonjour je m'appelle "+nom+" et j'aime boire du "+boisson+" et j'ai "+argent+" sous en poche");

    }

    public void boire(){
        parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
    }

    public int getArgent(){
        return argent;
    }

    public String getBoisson(){
        return boisson;
    }

    public String getNom(){
        return nom;
    }

    public void gagnerArgent(int argent){this.argent+=argent;}

    public void perdreArgent(int argent){this.argent-=argent;}

}
