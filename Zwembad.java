package practium_2;

public class Zwembad {

    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double Breedte, double Lengte, double Diepte) {
        breedte = Breedte;
        lengte = Lengte;
        diepte = Diepte;
    }

    public double inhoud(){ return breedte * lengte * diepte; }

    public double getBreedte(){ return breedte; }
    public double getLengte(){ return lengte; }
    public double getDiepte(){ return diepte; }

    public Zwembad(){
        breedte = 0.0;
        lengte = 0.0;
        diepte = 0.0;
    }

    public void setBreedte(double Breedte){ breedte = Breedte; }
    public void setLengte(double Lengte){ lengte = Lengte; }
    public void setDiepte(double Diepte){ diepte = Diepte; }

    public String toString(){
        String x = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
        return x;
    }
}
