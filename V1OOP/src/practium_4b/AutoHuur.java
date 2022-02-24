package practium_4b;

public class AutoHuur {

    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    private String AutoString;
    private String HuurderString;

    //Weet oprecht niet wat dit moet doen
    public AutoHuur(){

    }

    public void setAantalDagen(int aD){ this.aantalDagen = aD;}
    public int getAantalDagen(){ return aantalDagen;}

    public void setGehuurdeAuto(Auto gA){ this.gehuurdeAuto = gA;}
    public Auto getGehuurdeAuto(){ return gehuurdeAuto;}

    public void setHuurder(Klant k){ this.huurder = k;}
    public Klant getHuurder() { return huurder; }

    public double totaalPrijs(){
        if(getGehuurdeAuto() != null && getHuurder() != null) {
            double prijsPerdag = getGehuurdeAuto().getPrijsPerDag() * aantalDagen;
            double prijsMetKorting = prijsPerdag - prijsPerdag * getHuurder().getKorting() / 100;
            return prijsMetKorting;
        }else{
            return 0.0;
        }
    }

    public String toString(){

        if(gehuurdeAuto == null){
            AutoString = "er is geen auto bekend";
        } else{
            AutoString = gehuurdeAuto.toString();
        }
        if(huurder == null){
            HuurderString = "er is geen huurder bekend";
        }else {
            HuurderString = huurder.toString();
        }

        return AutoString + "\n" + HuurderString + "\naantal dagen: " + aantalDagen + " en de kost " + totaalPrijs();
    }

}
