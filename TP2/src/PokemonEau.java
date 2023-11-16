public class PokemonEau extends Pokemon{

    public PokemonEau(String nom){
        super(nom,TypePokemon.EAU);
    }

    @Override
    public void attaquer(Pokemon pokemon) {
        this.log("J'attaque le pokemon "+pokemon.getNom()+pokemon.getType()+" VS "+this.getType());
        pokemon.subir(this);
    }

    @Override
    public void subir(Pokemon pokemon) {
        switch (pokemon.getType()) {
            case TypePokemon.EAU -> this.hp -= pokemon.getAtk();
            case TypePokemon.PLANTE -> this.hp -= 2 * pokemon.getAtk();
            case TypePokemon.FEU -> this.hp -= 0.5 * pokemon.getAtk();

        }
    }

}
