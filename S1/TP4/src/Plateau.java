import java.util.ArrayList;

public class Plateau {


    private static int NB_CASES=63;

    private ArrayList<Case> cases = new ArrayList<>();

    public Plateau(){
        for(int i=1;i<=63;i++){
            cases.add(new Case(i));
        }
    }

    public Case caseDebutPartie(){
        return cases.get(1);
    }

    public Case donnerCase(int numCase){
        return cases.get(numCase);
    }

    private void initialisationCasesSpecifique();


}
