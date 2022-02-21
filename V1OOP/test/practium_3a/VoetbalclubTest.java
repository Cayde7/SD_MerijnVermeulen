package practium_3a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    public void testEmptyClubnaam(){
        Voetbalclub ajx = new Voetbalclub("");
        assertEquals("FC", ajx.getClubnaam());
    }

    @Test
    public void testPunten(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        assertEquals(12, feij.aantalPunten());
    }

    @Test
    public void testGespeeld(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('v');
        assertEquals(5, feij.aantalGespeeld());
    }

    @Test
    public void testToString(){
        Voetbalclub twente = new Voetbalclub("FC Twente");
        twente.verwerkResultaat('w');
        twente.verwerkResultaat('w');
        twente.verwerkResultaat('v');
        twente.verwerkResultaat('g');
        twente.verwerkResultaat('v');
        assertEquals("FC Twente 5 2 1 2 7", twente.toString());
    }

}