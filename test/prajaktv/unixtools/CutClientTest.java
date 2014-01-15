package prajaktv.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CutClientTest {

    @Test
    public void test_for_reducing_more_than_one_speces() throws Exception {
        String text = "p r a\np r a\np r a";
        Cut cut = new Cut();
        String expected = "p\np\np\n";
        String actual = cut.cutCount(text, 1, " ");
        assertEquals(expected, actual);
    }

    @Test
    public void test_for_reducing_more_than_one_speces_for_second_filed() throws Exception {
        String text = "p r a\np r a\np r a";
        Cut cut = new Cut();
        String expected = "r\nr\nr\n";
        String actual = cut.cutCount(text, 2, " ");
        assertEquals(expected, actual);
    }

    @Test
    public void test_for_reducing_more_than_one_speces_for_couma_saparator() throws Exception {
        String text = "p,r,a\np,r,a\np,r,a";
        Cut cut = new Cut();
        String expected = "r\nr\nr\n";
        String actual = cut.cutCount(text, 2, ",");
        assertEquals(expected, actual);
    }
}