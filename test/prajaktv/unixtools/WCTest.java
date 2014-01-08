package prajaktv.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WCTest {

    @Test
    public void testCountLines() throws Exception {
        String data = "prajakta\nSayali\nPallavi\nSamiksha\nkavita\nshital";
        WC lib = new WC();
        lib.wc(data);
        int expected = 5;

        int actual = lib.countLines();

        assertEquals(expected, actual);
    }

    @Test
    public void testCountCharacters() throws Exception {
        String data = "prajakta Sayali Pallavi Samiksha kavita shital";
        WC lib = new WC();
        lib.wc(data);
        int expected = 46;

        int actual = lib.countCharacters();

        assertEquals(expected, actual);
    }

    @Test
    public void testCountWords() throws Exception {
        String data = "prajakta Sayali Pallavi Samiksha kavita shital";
        WC lib = new WC();
        lib.wc(data);
        int expected = 6;

        int actual = lib.countWords();

        assertEquals(expected, actual);
    }
}
