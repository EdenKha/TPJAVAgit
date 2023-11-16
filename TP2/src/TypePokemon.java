public enum TypePokemon {
    FEU("FEU"),
    EAU("EAU"),
    PLANTE("PLANTE");

    private String nom;



    private TypePokemon(String nom){
        this.nom=nom;
    }

    public String toString(){
        return this.nom;
    }



}
