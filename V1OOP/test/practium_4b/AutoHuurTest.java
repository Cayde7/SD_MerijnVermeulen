package practium_4b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {

    @Test
    public void testTotalePrijsKorting(){
        AutoHuur ah1 = new AutoHuur();
        Klant x = new Klant("Mijnheer Vermeulen");
        x.setKorting(0.0);
        ah1.setHuurder(x);
        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        assertEquals(200.0, ah1.totaalPrijs());
    }

    @Test
    public void testGeenHuuderOfAuto(){
        AutoHuur ah1 = new AutoHuur();
        assertEquals("er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en de kost 0.0", ah1.toString());
    }

    @Test
    public void testHuuderZonderAuto(){
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);

        assertEquals("er is geen auto bekend\nop naam van: Mijnheer de Vries (korting: 10.0%)\naantal dagen: 0 en de kost 0.0", ah1.toString());
    }

    @Test
    public void testAutoZonderHuurder(){
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\ner is geen huurder bekend\naantal dagen: 4 en de kost 0.0", ah1.toString());
    }

    @Test
    public void testTotalePrijsMetDouble(){
        AutoHuur ah1 = new AutoHuur();
        Klant x = new Klant("Mijnheer Vermeulen");
        x.setKorting(0.0);
        ah1.setHuurder(x);
        Auto a1 = new Auto("Peugeot 207", 99.999);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        assertEquals(399.996, ah1.totaalPrijs());
    }

}