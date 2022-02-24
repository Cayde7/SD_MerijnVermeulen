package practium_3b;

public class Cirkel {

    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius, int x, int y){
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.radius = radius;
        this.xPositie = x;
        this.yPositie = y;
    }

    public String toString(){
        return "cirkel (" + xPositie + ", " + yPositie +  ") met radius: " + radius;
    }

}
