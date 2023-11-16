package histoires;
import personnages.principaux.Commercants;
import personnages.Humain;
import personnages.principaux.Ronin;
import personnages.principaux.Yakuza;
import personnages.secondaires.Ninja;

public class MonHistoire {

    public static void main(String [] args) {
        Commercants commercant = new Commercants("Marchand", 35);
        commercant.direBonjour();
        Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42,
                "biere", "WarSong");
        yakusa.direBonjour();
        yakusa.extorquer(commercant);
        Ronin ronin = new Ronin("Roro", 61, "sake");
        ronin.donner(10, commercant );
        ronin.provoquer(yakusa);
        ronin.direBonjour();
        Ninja ninja= new Ninja("Yamato",5,"the","Long fangs");
        ninja.direBonjour();
    }


}
