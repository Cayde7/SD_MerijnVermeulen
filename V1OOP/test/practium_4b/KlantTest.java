package practium_4b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlantTest {

    @Test
    public void testKorting(){

        Klant x = new Klant("Mijnheer Vermeulen");
        x.setKorting(0.0);

        assertEquals("op naam van: Mijnheer Vermeulen (korting:0.0%)", x.toString());

    }

}