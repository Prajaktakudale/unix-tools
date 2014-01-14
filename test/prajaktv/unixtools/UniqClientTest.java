package prajaktv.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqClientTest {
    @Test
    public void test_for_reducing_more_than_one_speces() throws Exception {
        String text = "praju\npallu\npallu\npraju";
        Uniq uniq = new Uniq();
        String expected = "praju\npallu\npraju\n";
        String actual = uniq.getUniqLines(text);
        assertEquals(expected, actual);
    }
}