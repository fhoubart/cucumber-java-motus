package hellocucumber;

public class App {

    private String motADeviner;
    private boolean aGagne;
    private Case[] cases;

    public App() {
        this.motADeviner = "";
        this.aGagne = false;
        this.cases = new Case[7];
        for(int i=0; i<7; i++) this.cases[i] = new Case("noire");
    }

    public void setMotADeviner(String mot) {
        this.motADeviner = mot;
    }

    public void propose(String mot) {
        if(mot.equals(this.motADeviner)) this.aGagne = true;
        this.cases[0].setCouleur("rouge");
        this.cases[1].setCouleur("jaune");
        this.cases[2].setCouleur("jaune");
        this.cases[3].setCouleur("jaune");
        this.cases[4].setCouleur("jaune");
        this.cases[5].setCouleur("jaune");
        this.cases[6].setCouleur("jaune");
    }

    public boolean aGagne() {
        return this.aGagne;
    }

    public Case getCase(int i) {
        return this.cases[i-1];
    }

    
}