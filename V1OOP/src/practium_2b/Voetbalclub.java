package practium_2b;

public class Voetbalclub {

    private String clubNaam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        clubNaam = naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten(){
        int punten = aantalGewonnen * 3 + aantalGelijk;
        return punten;
    }

    public int aantalGespeeld(){
        int gespeeld = aantalGelijk + aantalVerloren + aantalGewonnen;
        return gespeeld;
    }

    public String toString(){
        return clubNaam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }


}
