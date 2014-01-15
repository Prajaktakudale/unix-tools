package prajaktv.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CutClientTest {

    @Test
    public void testForReducingMoreThanOneSpeces() throws Exception {
        String text = "p r a\np r a\np r a";
        Cut cut = new Cut();
        String expected = "p\np\np\n";

        String actual = cut.cutCount(text, 1, " ");

        assertEquals(expected, actual);
    }

    @Test
    public void testForReducingMoreThanOneSpecesForSecondFiled() throws Exception {
        String text = "p r a\np r a\np r a";
        Cut cut = new Cut();
        String expected = "r\nr\nr\n";

        String actual = cut.cutCount(text, 2, " ");

        assertEquals(expected, actual);
    }

    @Test
    public void testForReducingMoreThanOneSpecesForCoumaSaparator() throws Exception {
        String text = "p,r,a\np,r,a\np,r,a";
        Cut cut = new Cut();
        String expected = "r\nr\nr\n";

        String actual = cut.cutCount(text, 2, ",");

        assertEquals(expected, actual);
    }
}