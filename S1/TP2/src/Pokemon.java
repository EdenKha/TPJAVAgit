import java.util.Random;
public abstract class Pokemon {
    private String nom;
    protected int hp;
    private int atk;
    private int niveau;
    private TypePokemon type;

    private static java.util.Random random= new Random();

    public Pokemon(String nom,TypePokemon type){
        this.nom=nom;
        this.niveau=random.nextInt(1,10);
        this.hp=niveau*2;
        this.atk=(niveau/2)+1;
        this.type=type;
    }

    public String getNom(){
        return nom;
    }
    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getNiveau() {
        return niveau;
    }

    public TypePokemon getType(){
        return this.type;
    }

    public Boolean isKO() {
        if (this.hp < 0) {
            return Boolean.TRUE;
        } else return Boolean.FALSE;
    }

    public void soigner(){
        if(isKO()){
            this.hp=2*this.niveau;
        }
        else
            System.out.println("Le pokemon n'est pas ko");
    }

    public abstract void attaquer(Pokemon pokemon);

    public abstract void subir(Pokemon pokemon);

    public String toString(){
        return
                " Je m'appelle " + this.nom + " ! "+
                        " Je suis niveau " + this.niveau+
                        " J'ai " + this.hp + " points de vie " +
                        " Mon attaque de base est " + this.atk +
                        " Je suis de type "+this.type;
    }

    private String prefixe(){
        return "["+this.nom+"]";
    }
    public void log(String msg){

        System.out.println(prefixe()+msg);
    }


}

